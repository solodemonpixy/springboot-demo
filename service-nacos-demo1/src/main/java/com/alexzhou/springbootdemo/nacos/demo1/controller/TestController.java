package com.alexzhou.springbootdemo.nacos.demo1.controller;

import com.alexzhou.springbootdemo.nacos.demo1.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestConfig testConfig;

    @GetMapping("/hello")
    public String hello(){
        return "hello world"+testConfig.getTestConf1();
    }

}
