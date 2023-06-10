package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

// CTRL+Shit+O
public class AutomationDemoSite {
	
	public static WebDriver driver; //interface
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops); 
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("User Navigated URL");	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Czech\"]")).click();
		
		
		Thread.sleep(5000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
