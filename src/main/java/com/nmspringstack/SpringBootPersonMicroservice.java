package com.nmspringstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@ComponentScan("com.nmspringstack")
@EnableSwagger2
public class SpringBootPersonMicroservice {

	@Profile("mysql")
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonMicroservice.class, args);
	}
}
