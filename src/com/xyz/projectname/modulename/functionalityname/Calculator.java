package com.xyz.projectname.modulename.functionalityname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calculator {
	
	Calculator() { // Default Constructor 
		
		 System.out.println("I am in the Constructor");
		 
		 System.out.println("Good Morning !!!");
	}
	
	 Calculator(String name) { // Argumented Constructor
		
		 System.out.println("I am in the Constructor");
		 
		 System.out.println("Good Morning !!!" +name );
	}

	public static WebDriver driver;
	
	public static void main(String[] args) { // JVM 
		
	//	System.out.println("Good Morning !!!!");
		
//		 new Calculator().addition(5, 6);   ; // memory allocation , JVM
//		 
//		 new Calculator().substraction(6, 3); // memory allocation2 , JVM
//		 
//		 new Calculator().multiplication(3, 5); // memory allocation3 , JVM
//		 
//		 new Calculator().division(8, 2); // memory allocation4 , JVM
//		 
//		 System.out.println("****************************************");
	 
		// Calculator cal = new Calculator();
		 
		 Calculator cal = new Calculator("Poornima"); // Reco  // memory allocation only once, JVM
		 
		 cal.addition(4, 5);
		 cal.addition(4, 5, 44, 66);
		 cal.substraction(6, 90);
		 cal.multiplication(3, 5);
		 cal.division(8, 18);
//		 
		 // 1000
		 
//		 Actions action = new Actions(driver);
//		 
//		 action.click();
//		 
	}
	
	public static void addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition of two numbers:" +c);
		
	}
	
	public static void addition(int a, int b, int c, int d) {
		int add = a+b+c+d;
		System.out.println("Addition of two numbers:" +add);
		
	}
	
	public static void substraction(int a, int b) {
			int c = b-a;
		
		System.out.println("Substraction of two numbers:" +c);
		
	}
	
	public static void multiplication(int a, int b) {

		System.out.println("Multiplication of two numbers:" + a*b);
		
	}
	
	public static void division(int a, int b) {
		System.out.println("Division of two numbers:" + (b/a));
	}

}
