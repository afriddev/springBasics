
/*
 * TIGHT COUPLING EXAMPLE 
 * 
 * */

package com.afrid.spring;

public class main {
	public static void main(String [] args) {
		/*
		 * IF I WANT PASS A VALUE IN objMain I WANT CHANGE ENTIRE CODE
		 * CHANGE CODE IN DOWNLOADING.java FILE
		 * FOR THAT I NEED TO CHANGE CODE TO TIGHT COUPLING TO LOOSE  COUPLING 
		 * */
		
		//var a = new youtube();
		var b = new instagram();
		var objMain = new  downloading(b);
		objMain.downloadbu();
		
		
		
	}

}
