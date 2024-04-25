package com.irshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudHystrixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixEurekaServerApplication.class, args);
	}

}