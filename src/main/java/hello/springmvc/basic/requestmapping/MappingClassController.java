package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

//요청 매핑 - API 예시(실제 데이터가 넘어가는 부분은 생략하고 URL 매핑만)(Postman으로 테스트)
@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * GET /mapping/users
     */
    @GetMapping
    public String user(){
        return "get users";
    }

    /**
     * POST /mapping/users
     */
    @PostMapping
    public String addUser(){
        return "post user";
    }

    /**
     * GET /mapping/users/{userId}
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId="+userId;
    }

    /**
     * PATCH /mapping/users/{userId}
     */
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId="+userId;
    }

    /**
     * DELETE /mapping/users/{userId}
     */
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId="+userId;
    }
}
