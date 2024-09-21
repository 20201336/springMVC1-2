package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//HTTP 응답 - 정적 리소스, 뷰 템플릿
@Controller
public class ResponseViewController {               //뷰 템플릿(/templates/response/hello.html)을 호출하는 컨트롤러

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav=new ModelAndView("response/hello")
                .addObject("data","hello!");
        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){      //권장*****
        model.addAttribute("data","hello!");

        return "response/hello";
    }

    @RequestMapping("/response/hello")
    public void responseViewV3(Model model){        //권장x(명시성 떨어짐)
        model.addAttribute("data","hello!");
    }
}
