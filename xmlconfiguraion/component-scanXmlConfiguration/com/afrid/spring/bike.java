package com.afrid.spring;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle{
	public void drive() {
		System.out.println("bike ...");
	}

}
