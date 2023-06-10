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
public class MultipleMenuSelection {
	
	public static WebDriver driver; //interface
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops); 
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://www.flipkart.com/");
		System.out.println("User Navigated URL");	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		
		WebElement main_menu = driver.findElement(By.xpath("//*[text()=\"Electronics\"]"));
		
		Actions act = new Actions(driver);  // Class ... Operation on Driver
		
		//Select sel = new Select(main_menu); // Class... Operation on the Web element 
		
		Thread.sleep(2000);
		act.moveToElement(main_menu).perform();
		System.out.println("Mouseover operation is performed on Electronics section");
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[text()=\"Computer Peripherals\"]"))).perform();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[text()=\"Projectors\"]")).click();
		
		driver.findElement(By.linkText("Projectors")).click();
		
		Thread.sleep(5000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
