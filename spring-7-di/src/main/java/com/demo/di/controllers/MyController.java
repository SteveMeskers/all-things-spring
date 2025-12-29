package com.demo.di.controllers;

import org.springframework.stereotype.Controller;

import com.demo.di.services.GreetingService;
import com.demo.di.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String saySomething(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
