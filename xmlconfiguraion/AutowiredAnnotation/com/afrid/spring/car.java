package com.afrid.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class car {
	@Autowired
	speed speed;
	
	void run() {
		System.out.println("car is runing speed of :- " +speed.getSpeed());
	}
}
