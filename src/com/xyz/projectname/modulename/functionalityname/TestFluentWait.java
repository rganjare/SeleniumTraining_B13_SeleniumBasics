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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

// CTRL+Shit+O
public class TestFluentWait {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	   
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 10 sec
	    
	    Wait<WebDriver>	f_wait = new FluentWait<WebDriver>(driver) // fluent wait mostly used
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)) // 6 times
				.ignoring(NoSuchElementException.class);

	    
	    WebDriverWait wd_wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // polling 
	    
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		System.out.println("User Navigated to softwaretestingplace Page");
		
		
		//Thread.sleep(2000);
		String initial_text = driver.findElement(By.xpath("//*[text()=\"Click and Wait for \"]")).getText();
		System.out.println("Initial_text is :- " +initial_text);
		
		Assert.assertEquals(initial_text, "");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		System.out.println("Username clicked on Fluent wait button");
		
		
		//f_wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\"demo\"]"), initial_text));
		wd_wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\"demo\"]"), initial_text));
		System.out.println("driver waited till the text invisible");
		
		
		String new_text = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println("New_text is :- " +new_text);
		
		Thread.sleep(5000);
		driver.quit(); // Kill my instance 
		
	}
}
