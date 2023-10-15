package com.afrid.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration
public class car {
	
	@Bean
	void run() {
		System.out.println("car is runing ... ");
	}
}
