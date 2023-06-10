package com.xyz.projectname.modulename.functionalityname;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

// CTRL+Shit+O
public class TestPropertiesFileWithLoginToInstagram {
	
	
	public static String browser; 
	public static WebDriver driver; // Interface
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\com\\xyz\\projectname\\modulename\\propertiesFiles\\Config.properties");
		Properties config = new Properties();
		config.load(fis);
		System.out.println("Config file has been loaded");
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\com\\xyz\\projectname\\modulename\\propertiesFiles\\OR.properties");
		Properties or = new Properties();
		or.load(fis1);
		System.out.println("OR file has been loaded");
		
		System.out.println(config.getProperty("browser"));
		System.out.println(config.getProperty("app_url_test"));
		System.out.println(config.getProperty("usernme"));
		System.out.println(config.getProperty("password"));
		
		
		if(config.getProperty("browser").equalsIgnoreCase("Chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(ops); // Local variable
		} else if(config.getProperty("browser").equalsIgnoreCase("edge")){
			 driver = new EdgeDriver();
		} else if(config.getProperty("browser").equalsIgnoreCase("FF")){
			driver = new FirefoxDriver();
		} else {
			
			driver = new EdgeDriver(); // Default Action
		}
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
	    Wait<WebDriver>	f_wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)) // 6 times
				.ignoring(NoSuchElementException.class);

	    
		driver.get(config.getProperty("app_url_test"));
		System.out.println("User Navigated to Instagram Page");
		
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("cookies"))).click();
	
		
		//Thread.sleep(5000); // Entered username
	//	driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("BymatAutomation@gmail.com");
	//	System.out.println("Username has been entered");
		
		
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty("usrname")))).sendKeys(config.getProperty("usernme"));
		System.out.println("Username has been entered");
		
		//Thread.sleep(2000);// Entered Password
		//driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Passworddsfsdfs234323");
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty("password")))).sendKeys(config.getProperty("password"));
		System.out.println("Password has been entered");
		
		
		//Thread.sleep(2000);// Clicking the Login button
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty("submit")))).click();
		System.out.println("Clicking on Login Button");
		
		Thread.sleep(5000); // Hard Coded wait
		driver.quit(); // Kill my instance 
		
	}
}
