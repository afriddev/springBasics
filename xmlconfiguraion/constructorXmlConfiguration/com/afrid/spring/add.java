package com.afrid.spring;
public class add implements calcMethod{
	int num1;
	int num2;
	
	public add(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void operation() {System.out.println(num1+num2);
	}
	

}
