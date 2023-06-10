package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

// CTRL+Shit+O
public class LoginToInstagram {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	   
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://www.instagram.com/");
		System.out.println("User Navigated to Instagram Page");
		
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Allow essential and optional cookies\"]")).click();
		
		
//		Thread.sleep(3000); // Entered username
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("BymatAutomation@gmail.com");
//		
//		// Entered Password
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Passworddsfsdfs234323");
//		
//		// Clicking the Login button
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		
		//Thread.sleep(5000); // Entered username
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("BymatAutomation@gmail.com");
		System.out.println("Username has been entered");
		
		//Thread.sleep(2000);// Entered Password
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Passworddsfsdfs234323");
		System.out.println("Password has been entered");
		
		
		//Thread.sleep(2000);// Clicking the Login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("Clicking on Login Button");
		
		//Thread.sleep(5000); // Hard Coded wait
		driver.quit(); // Kill my instance 
		
	}
}
