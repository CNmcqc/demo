package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {


    @RequestMapping("/hand")
    public  String hand1(){

        return "你给按揭那就";
    }
}
