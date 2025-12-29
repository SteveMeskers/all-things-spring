package com.demo.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.demo.di.services.GreetingService;

@Controller
public class Myi18NController {
    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String saySomething() {
        return greetingService.sayGreeting();
    }
}
