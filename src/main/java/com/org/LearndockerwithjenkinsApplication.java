package com.org;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearndockerwithjenkinsApplication {

	@PostConstruct
	public void init(){
		System.out.println("Test Application run...");
	}
	public static void main(String[] args) {
		System.out.println("Test Application up and running...");
		SpringApplication.run(LearndockerwithjenkinsApplication.class, args);
	}

}
