package com.afrid.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class mobilePhone {
	@Autowired
	@Qualifier("mediateck")
	processor cpu;
	public void display() {
		System.out.println("8gb ram,13 cores mobile phone");
		cpu.processorName();
	}

}
