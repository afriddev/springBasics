/*
 * XMl CONFIGURATION
 * 
 * */

package com.afrid.spring; // see the dirpath == package

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String [] args) {
		
	var context = new ClassPathXmlApplicationContext("spring.xml");
	var b = (vehicle)context.getBean("a");
		b.drive();
	}

}
