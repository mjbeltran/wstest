package com.wstest.wstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan("com.wstest.controller")
@RestController
@SpringBootApplication
public class WstestApplication {
    
	
	@RequestMapping("/")
	public String index() {
		return "Hola Mundo!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WstestApplication.class, args);
	}
}