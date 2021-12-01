package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldExampleApplication
{
	public static void main(String[] args) 
	{
		System.out.println("Inside Main");
		SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
	}
}