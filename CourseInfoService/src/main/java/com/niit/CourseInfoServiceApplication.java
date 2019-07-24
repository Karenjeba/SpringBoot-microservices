package com.niit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CourseInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseInfoServiceApplication.class, args);
	}

}
