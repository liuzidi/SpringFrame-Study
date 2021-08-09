package lzd.zju.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:liuzidi
 * @Description:
 */
//@ResponseBody回复体
//@Controller 控制器
//两者合体相当于RestController

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handler01(){
        return "hello!spring boot2";
    }
}
