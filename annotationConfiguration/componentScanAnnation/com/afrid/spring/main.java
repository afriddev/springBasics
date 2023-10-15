/*
 * ANNOTATION BASED CONFIGURATION
 * */

package com.afrid.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
	public static void main(String [] args) {
		var context = new AnnotationConfigApplicationContext(phoneConfig.class);
		var phone = context.getBean(mobilePhone.class);
		phone.display();
		
		
	}
}
