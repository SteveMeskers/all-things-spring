package com.demo.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.di.controllers.MyController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(controller.saySomething());
	}

}
