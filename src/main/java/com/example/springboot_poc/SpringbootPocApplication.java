package com.example.springboot_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPocApplication.class, args);
		System.out.print("Hello");
	}
}
