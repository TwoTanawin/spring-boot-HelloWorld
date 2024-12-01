package com.arsenal.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String display() {
        return "Hello Spring Boot";
    }

    @GetMapping("/about")
    public String about(){
        return "About Me HeHe ...";
    }

    @GetMapping("/test-dev")
    public String test(){
        return "test dev tool";
    }

    @GetMapping("/test-api")
    public String testApi(){
        return "Hello API";
    }
}
