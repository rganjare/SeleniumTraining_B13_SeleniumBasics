package com.xyz.projectname.modulename.functionalityname;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// CTRL+Shit+O
public class TestNGWithLoginToInstagram {
	
	
	public static String browser;  
	public static WebDriver driver; // Global Variables
	public static FileInputStream fis, fis1;
	//public static FileInputStream fis1;
	public static Properties config, or;
	//public static Properties or;
	public static Wait<WebDriver> f_wait;
	
	@BeforeClass
	public static void loadFiles() throws IOException {
		 fis = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\com\\xyz\\projectname\\modulename\\propertiesFiles\\Config.properties");
		 config = new Properties();
		config.load(fis);
		System.out.println("Config file has been loaded");
		
		fis1 = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\com\\xyz\\projectname\\modulename\\propertiesFiles\\OR.properties");
		or = new Properties();
		or.load(fis1);
		System.out.println("OR file has been loaded");  

	}
	
	
	@BeforeMethod
	public static void launchBrowser() {
		
		if(config.getProperty("browser").equalsIgnoreCase("Chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			System.setProperty("Webdriver.chrome.driver", "D:\\BYMAT_Automation\\Drivers\\LatestDrivers\\chromedriver.exe");
		    driver = new ChromeDriver(ops); // Local variable
		} else if(config.getProperty("browser").equalsIgnoreCase("edge")){
			System.setProperty("Webdriver.edge.driver", "D:\\BYMAT_Automation\\Drivers\\LatestDrivers\\msedgedriver.exe");
			 driver = new EdgeDriver();
		} else if(config.getProperty("browser").equalsIgnoreCase("FF")){
			System.setProperty("Webdriver.gecko.driver", "D:\\BYMAT_Automation\\Drivers\\LatestDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("Webdriver.edge.driver", "D:\\BYMAT_Automation\\Drivers\\LatestDrivers\\msedgedriver.exe");
			driver = new EdgeDriver(); // Default Action
		}
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    System.out.println("implicitlyWait defined");
	    
	  	f_wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)) // 6 times
				.ignoring(NoSuchElementException.class);
	  	
	  	 System.out.println("FluentWait defined");
	    driver.get(config.getProperty("app_url_test"));
		System.out.println("User Navigated to Instagram Page");
		
	}
	
	@Test
	public static void loginToInstaWithValidCred() {

//	boolean status =	driver.findElement(By.xpath(or.getProperty("cookies"))).isDisplayed();
//		Assert.assertEquals(status, true);
	
		Assert.assertTrue(driver.findElement(By.xpath(or.getProperty("cookies"))).isDisplayed() , "Cookies message not displayed");
		
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty("usrname")))).sendKeys(config.getProperty("usernme"));
		System.out.println("Username has been entered");
		
	
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty("password")))).sendKeys(config.getProperty("password"));
		System.out.println("Password has been entered");
		
		f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty("submit")))).click();
		System.out.println("Clicking on Login Button");	
		
		String error_message = driver.findElement(By.xpath(or.getProperty("errorMsg"))).getText();
		
		Assert.assertEquals(error_message, "Sorry, your password was incorrect. Please double-check your pas");
	}
	
	@Test
	public static void loginToInstaWithValidUsernameAndInvalidPassword() {
		System.out.println("loginToInstaWithValidUsernameAndInvalidPassword");
	}
	
	@Test
	public static void loginToInstaWithInValidUsernameAndInvalidPassword() {
		System.out.println("loginToInstaWithInValidUsernameAndInvalidPassword");
	}
	
	@Test
	public static void loginToInstaWithInValidUsernameAndvalidPassword() {
		System.out.println("loginToInstaWithInValidUsernameAndvalidPassword");
	}
	
	@Test
	public static void loginToInstaWithValidUsernameAndINvalidPassword() {
		System.out.println("loginToInstaWithValidUsernameAndINvalidPassword");
	}
	
	@AfterMethod
	public static void tearDown() throws InterruptedException {
		Thread.sleep(5000); // Hard Coded wait
		driver.quit(); // Kill my instance 
		System.out.println("###################################################33");
	}
	

}
