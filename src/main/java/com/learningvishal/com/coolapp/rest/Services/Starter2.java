package com.learningvishal.com.coolapp.rest.Services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command Line Runner starter 2");
    }
}
