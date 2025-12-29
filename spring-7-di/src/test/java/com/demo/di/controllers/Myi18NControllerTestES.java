package com.demo.di.controllers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("es")
@SpringBootTest
public class Myi18NControllerTestES {
    @Autowired
    Myi18NController myi18NController;

    @Test
    void saySomething() {
        System.out.println(myi18NController.saySomething());
    }
}
