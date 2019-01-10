package com.demo.call;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.demo.call"})
public class CallMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallMeApplication.class, args);
	}
}
