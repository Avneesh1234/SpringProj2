package com.vwit.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class HelloSpringBootApp extends SpringBootServletInitializer{
public static void main(String[] args) {
	SpringApplication.run(HelloSpringBootApp.class, args);
	
}
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	// TODO Auto-generated method stub
	return builder.sources(HelloSpringBootApp.class);
}
}