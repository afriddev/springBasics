package com.afrid.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class snapdragon implements processor{
	public void processorName() {
		System.out.println("SnapDrago is the best processor !");
	}

}
