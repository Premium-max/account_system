package com.jiashengdong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

    @RequestMapping("getName")
    public String getName(){
        return "SpringCloud!";
    }
}
