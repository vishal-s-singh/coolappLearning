package com.learningvishal.com.coolapp.rest.Services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

public class starter1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command Line Runner starter 1");
    }
}
