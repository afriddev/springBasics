package com.afrid.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class phoneConfig {
	@Bean
	public mobilePhone phone() {
		return new mobilePhone();
	}
	@Bean
	public processor getProcessorname() {
		return new snapdragon();
	}
}
