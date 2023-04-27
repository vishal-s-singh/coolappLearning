package com.learningvishal.com.coolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunTestController {

    @Value("${user.firstName}")
    private String userName;

    @GetMapping("/")
    public String test(){
        System.out.println(userName);
            String propertyValue = System.getProperty("user.firstName");
        System.out.println("Property value: " + propertyValue);
        System.out.println("Variable value: " + userName);
        return "Testing by "+userName;
    }
}
