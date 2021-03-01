package com.HelloWorld.Factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class FactoryApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FactoryApplication.class, args);
	}

}
