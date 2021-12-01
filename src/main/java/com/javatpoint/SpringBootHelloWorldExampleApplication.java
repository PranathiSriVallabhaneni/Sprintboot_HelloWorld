package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldExampleApplication
{
	
	public SpringBootHelloWorldExampleApplication()
	{
		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello from Main Method!!!");
		SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
	}
}