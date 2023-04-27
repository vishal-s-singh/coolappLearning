package com.learningvishal.com.coolapp.rest.controller;

import com.learningvishal.com.coolapp.rest.entity.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private final Coach coach;

    @Autowired
    public UserController(@Qualifier("alpha") Coach coach){
        System.out.println("In UserController Constructor " + getClass().getSimpleName());
        this.coach = coach;
    }

    @PostConstruct
    public void postConstructStuffLog(){
        System.out.println("In UserController Post construct " + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroyStuff(){
        System.out.println("Pre Destroy Stuff here " + getClass().getSimpleName());
    }

    @GetMapping("/dailyWorkout")
    public String dailyTipsForWorkout(){
        return this.coach.getDailyWorkout();
    }






}
