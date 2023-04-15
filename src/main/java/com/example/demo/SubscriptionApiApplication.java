package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.controller", "com.example.manager"})

public class SubscriptionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionApiApplication.class, args);
	}

}
