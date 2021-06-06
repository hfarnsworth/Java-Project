package com.havi.playgroundwebbackend.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaProjectApplication.class, args);
	}

}

@RestController
public class HelloWorldController {}