/*
 * XMl CONFIGURATION
 * ANNOTATION CONFIGURATION
 * 
 * */
package com.afrid.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
	public static void main(String [] args) {
		var context = new AnnotationConfigApplicationContext(car.class);
		var carObj =  (car)context.getBean("car");
	}
}
