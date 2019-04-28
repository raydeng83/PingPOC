package com.efx.pingpoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomePage() {
        return "home";
    }

    @RequestMapping("/selectMethod")
    public String selectMethod() {
        return "select-method";
    }

    @RequestMapping("/loginSuccess")
    public String loginSuccess() {
        return "login-success";
    }
}
