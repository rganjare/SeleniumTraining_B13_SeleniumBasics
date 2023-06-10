package com.xyz.projectname.modulename.functionalityname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowsersIfElseStatement {

	public static String browser = "Chrome"; 
	
	public static WebDriver driver; // Interface
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		if(browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(ops); // Local variable
		} else if(browser.equalsIgnoreCase("edge")){
			 driver = new EdgeDriver();
		} else if(browser.equalsIgnoreCase("FF")){
			driver = new FirefoxDriver();
		} else {
			
			driver = new EdgeDriver(); // Default Action
		}
		
		driver.manage().window().maximize();
	    
		driver.get("https://bymatAutomation.com");
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
