package com.candidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.candidate")
@SpringBootApplication
public class InterviewApp {
	public static void main(String args[]){
		SpringApplication.run(InterviewApp.class, args);
	}
}
