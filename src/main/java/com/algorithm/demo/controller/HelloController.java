package com.algorithm.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test(){
        return "欢迎来到华泰期货！111111111";
    }

}