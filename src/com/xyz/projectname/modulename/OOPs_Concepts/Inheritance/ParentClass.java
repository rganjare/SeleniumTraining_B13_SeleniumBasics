package com.xyz.projectname.modulename.OOPs_Concepts.Inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass {
	
	
	public static String a = "name";
	
	public static int b = 10;
	
	public static WebDriver driver; 
	
	public static void addition() {
		
		System.out.println("Addition of number");
		
		driver = new ChromeDriver();
	}

	
	// launching the Webdriver logic  // instance of the driver
	
}
