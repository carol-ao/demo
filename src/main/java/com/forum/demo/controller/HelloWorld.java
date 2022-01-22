package com.forum.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @RequestMapping(value = "/")
    @ResponseBody
    public String helloWorld(){
        return "hello world";
    }

}