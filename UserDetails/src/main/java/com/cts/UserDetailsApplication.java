package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsApplication.class, args);
	}

}
