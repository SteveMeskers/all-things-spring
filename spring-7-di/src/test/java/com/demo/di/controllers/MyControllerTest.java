package com.demo.di.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {
    @Test
    void testSaySomething() {
        MyController myController = new MyController();
        System.out.println(myController.saySomething());
    }
}
