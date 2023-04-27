package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.entity.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Daily Swimming 2000 meters";
    }
}
