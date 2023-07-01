package com.naren;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import reactor.core.publisher.Hooks;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {
	public static void main(String[] args) {
		Hooks.enableContextLossTracking();
		
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
