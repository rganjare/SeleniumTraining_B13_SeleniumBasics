package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// CTRL+Shit+O
public class TestAlert {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	   //ChromeDriver driver1 = new ChromeDriver(); 
	    
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		System.out.println("User Navigated to demo.guru99.com URL");	
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name=\"cusid\"]")).sendKeys("53920");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println("Driver Switched to Alert ");
		
//		Thread.sleep(2000);
//		alt.dismiss();
//		System.out.println("Alert cancelled");
		
		
		Thread.sleep(2000);
		alt.accept();
		System.out.println("Alert Accepted");
		
		Thread.sleep(2000);
		System.out.println("Alert Text message is:- " +alt.getText());
		
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(5000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
