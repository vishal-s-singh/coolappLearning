package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.entity.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    public  BaseBallCoach(){
        //System.out.println("In BaseBall Constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Baseball training 1 hrs";
    }
}
