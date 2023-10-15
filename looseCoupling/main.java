/*
 * LOOSE COUPLING EXAMPLE 
 * 
 * */

package com.afrid.spring;

public class main {
	public static void main(String [] args) {
		
		var a = new youtube(); 
		var b = new instagram();
		var myObj = new downloading(a);//we can pass any object 
		myObj.downloadbu();
		
	}

}
