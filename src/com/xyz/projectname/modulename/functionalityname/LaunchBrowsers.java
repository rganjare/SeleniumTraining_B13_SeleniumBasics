package com.xyz.projectname.modulename.functionalityname;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

// CTRL+Shit+O
public class LaunchBrowsers {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	
	    ChromeDriver driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	    driver.manage().window().maximize();
	    
		driver.get("https://bymatAutomation.com");
		
		
		Thread.sleep(5000);
		//driver.close(); // Current Active window/tab
		driver.quit(); // Kill my instance 
		
		Thread.sleep(2000);
		EdgeDriver driver_edge = new EdgeDriver();
		driver_edge.manage().window().maximize();
	    
		driver_edge.get("https://bymatAutomation.com");
		
		
		Thread.sleep(5000);
		driver_edge.quit();
		
		
	}
}
