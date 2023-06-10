package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

// CTRL+Shit+O
public class LoginToInstagramWaits {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	   
	    driver.manage().window().maximize(); // Selenium program in POM design pattern 
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
	    Wait<WebDriver>	f_wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)) // 6 times
				.ignoring(NoSuchElementException.class);

	    
		driver.get("https://www.instagram.com/");
		System.out.println("User Navigated to Instagram Page");
		
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Allow essential and optional cookies\"]")).click();
		
		//Thread.sleep(5000); // Entered username
	//	driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("BymatAutomation@gmail.com");
	//	System.out.println("Username has been entered");
		
		
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"username\"]"))).sendKeys("BymatAutomation@gmail.com");
		System.out.println("Username has been entered");
		
		//Thread.sleep(2000);// Entered Password
		//driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Passworddsfsdfs234323");
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"password\"]"))).sendKeys("Passworddsfsdfs234323");
		System.out.println("Password has been entered");
		
		
		//Thread.sleep(2000);// Clicking the Login button
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type=\"submit\"]"))).click();
		System.out.println("Clicking on Login Button");
		
		//Thread.sleep(5000); // Hard Coded wait
		driver.quit(); // Kill my instance 
		
	}
}
