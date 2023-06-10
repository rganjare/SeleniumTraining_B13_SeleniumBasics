package com.xyz.projectname.modulename.interface_test;

import org.openqa.selenium.WebDriver;

public class Test_webpage {  // User come in to picture

	
	public static Interface_Webdriver  driver_bymat;
	
	public static WebDriver driver;  // How it is operating from back end
	
	public static void main(String[] args) {
		
		driver_bymat = new ChromeDriver_bymat(); 
		
		driver_bymat.takeScreenshot();
		
		driver_bymat.xyzmethod11343();  // Static Method from Interface
		
		driver_bymat = new EdgeDriver_bymat();
		
		driver_bymat = new SafariDriver_bymat();
		
		driver_bymat.alerts();
		driver_bymat.click();
		driver_bymat.getText();
		driver_bymat.gettile();
		driver_bymat.sendKeys();
		
		ChromeDriver_bymat driver1 = new ChromeDriver_bymat();
		
		driver1.alerts();
		driver1.click();
		driver1.getText();
		driver1.sendKeys();
		driver1.gettile();
		
		driver1.takeScreenshot();
		
		EdgeDriver_bymat driver2 = new EdgeDriver_bymat();
		
		driver2.takeScreenshot();
		
		
	}

}
