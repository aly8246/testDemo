package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test/")
public class TestController {

    @Value("server.id")
    private String id;

    @GetMapping
    public String sayHello() {
        return "hello world instanceId:" + id;
    }
}
