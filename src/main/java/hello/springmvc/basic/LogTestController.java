package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log= LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){

        String name="Spring";

        System.out.println("name = "+name);

        //log.trace(" trace my log="+name);   //trace my log=Spring 올바른 사용법은 아님

        //로그 레벨 설정  TRACE > DEBUG > INFO > WARN > ERROR
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info(" info log={}",name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
