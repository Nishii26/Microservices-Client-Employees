package com.nish.MicroservicesEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicesEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaClientApplication.class, args);
	}

}
