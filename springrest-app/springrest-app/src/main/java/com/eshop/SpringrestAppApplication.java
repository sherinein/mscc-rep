package com.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringrestAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringrestAppApplication.class, args);
	}

}
