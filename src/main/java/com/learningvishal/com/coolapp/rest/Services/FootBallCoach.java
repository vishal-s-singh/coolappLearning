package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.entity.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {
    public  FootBallCoach(){
        //System.out.println("In FootBallCoach Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Do HIT for 30 minutes";
    }
}
