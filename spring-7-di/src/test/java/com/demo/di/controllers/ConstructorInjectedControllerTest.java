package com.demo.di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void testSaySomething() {
        System.out.println(constructorInjectedController.saySomething());
    }
}
