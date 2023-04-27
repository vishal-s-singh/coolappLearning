package com.learningvishal.com.coolapp.rest.configuration;

import com.learningvishal.com.coolapp.rest.Services.SwimCoach;
import com.learningvishal.com.coolapp.rest.entity.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("alpha")
    public Coach getCoach(){
        return new SwimCoach();
    }
}
