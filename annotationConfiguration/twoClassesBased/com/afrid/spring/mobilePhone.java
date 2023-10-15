package com.afrid.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class mobilePhone {
	@Autowired
	processor cpu;
	public void display() {
		System.out.println("8gb ram,13 cores mobile phone");
		cpu.processorName();
	}

}
