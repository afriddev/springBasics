/*
 * XMl CONFIGURATION
 * ANNOTATION CONFIGURATION
 * 
 * */
package com.afrid.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
	public static void main(String [] args) {
		
		var obJ = new ClassPathXmlApplicationContext("spring.xml");
		var calc = (calcMethod)obJ.getBean("add");
		calc.operation();
		
	}
}
