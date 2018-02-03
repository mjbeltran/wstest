package com.wstest.wstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wstest.controller")
@SpringBootApplication
public class WstestApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(WstestApplication.class, args);
	}
}