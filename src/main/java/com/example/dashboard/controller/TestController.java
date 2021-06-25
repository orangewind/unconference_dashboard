package com.example.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String Hello(){
        // 调用业务接受前端请求
        return "hello world";
    }
}
