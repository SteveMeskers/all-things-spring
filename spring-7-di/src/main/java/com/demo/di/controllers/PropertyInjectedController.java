package com.demo.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.demo.di.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String saySomething() {
        return greetingService.sayGreeting();
    }

}
