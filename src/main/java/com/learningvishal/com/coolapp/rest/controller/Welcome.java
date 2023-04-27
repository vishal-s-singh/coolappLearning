package com.learningvishal.com.coolapp.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {

    @GetMapping("/test")
    public String getMessage(){
        return "Hello Vishal, Welcome!!!";
    }
}
