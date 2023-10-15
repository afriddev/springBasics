package com.afrid.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class snapdragon implements processor{
	public void processorName() {
		System.out.println("SnapDrago is the best processor !");
	}

}
