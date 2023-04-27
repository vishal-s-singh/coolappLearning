package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.entity.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach {
    public  CricketCoach(){
        //System.out.println("In CricketCoach Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 15 minutes fast bowling practise!!!!";
    }
}
