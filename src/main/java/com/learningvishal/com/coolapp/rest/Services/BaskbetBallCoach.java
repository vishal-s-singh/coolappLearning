package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.entity.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaskbetBallCoach implements Coach {

    public  BaskbetBallCoach(){
        //System.out.println("In BaskbetBallCoach Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Basketball training daily 10 mins";
    }
}
