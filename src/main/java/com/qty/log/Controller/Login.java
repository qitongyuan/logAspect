package com.qty.log.Controller;

import com.qty.log.Annon.LogByMe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Login {
    @RequestMapping("/login")
    @LogByMe(project = "qty的项目",func = "登录功能")
    public String login(String name){
        return name+" 登录成功";
    }
}
