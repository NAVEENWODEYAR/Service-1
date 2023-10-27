package com.micros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Service1Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Service1Application.class, args);
		System.out.println("\n Service-1 started.,");
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate()
	{
		return new RestTemplate();
	}

}
