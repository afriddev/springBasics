package com.afrid.spring;

import org.springframework.stereotype.Component;

@Component
public class car implements vehicle{
	public void drive() {
		System.out.println("car ...");
	}

}
