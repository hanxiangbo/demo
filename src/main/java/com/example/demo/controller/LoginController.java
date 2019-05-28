package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:hxb
 *
 * @Date: 2019/5/21 11:26
 * @Description:
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String login1() {
        return "/login";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "/hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

    @RequestMapping("/home")
    public String home() {
        return "/home";
    }
}
