package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// CTRL+Shift+O
public class TestTabAndWindows {
	
	public static WebDriver driver; //interface
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops); 
	    
	    driver.manage().window().maximize();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); // 10 sec
	    
		driver.get("https://www.online.citibank.co.in/");
		System.out.println("User Navigated URL");	
			
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"txtSign\"]")).click();
		System.out.println("User cliced on Login link");
		
		
		 Set<String> tabs = driver.getWindowHandles(); // Collection in JAVA language // It's a collection of unique record or values
	
		 Iterator<String> itr =  tabs.iterator();
		 
		 System.out.println("Total number of windows :" +tabs.size());
		 
//		 while(itr.hasNext()) { //0,1
//			 
//			 System.out.println("Window id is:- " +itr.next());
//		 }
		
		String parent_window = itr.next(); // 0
		System.out.println("parent_window id is:- " +parent_window);
		
		String second_window = itr.next(); //1
		System.out.println("second_window id is:- " +second_window);
		
		//Thread.sleep(2000);
		driver.switchTo().window(second_window);
		System.out.println("Driver has switched to second_window");
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"User_Id\"]")).sendKeys("username");
		System.out.println("User entered username");
		
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		System.out.println("User entered password");
		
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/div/a/div")).click();
		System.out.println("User clicked on Login button");
		
	
		//Thread.sleep(2000);
		driver.switchTo().window(parent_window);
		System.out.println("Driver switched back to parent_window");
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ul[1]/li[10]/a")).click();
		System.out.println("User clicked NRI Banking link");
		
		 tabs = driver.getWindowHandles(); 
	     itr =  tabs.iterator();
		
		 System.out.println("Total number of windows :" +tabs.size());
		 
		 int counter = 1;
		 while(counter<=2) { //0,1
			 System.out.println("Window id is:- " +itr.next());
			 counter++;
		 }
		 
		 	String NRI_window = itr.next(); //3
			System.out.println("NRI_window id is:- " +NRI_window);
			
			driver.switchTo().window(NRI_window);
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/div[1]/ul[3]/li/a[1]/span[2]")).click();
		System.out.println("User clicked login link in NRI Banking link window");
		
		
		//driver.switchTo().window(parent_window);
	
		//Thread.sleep(5000);
		driver.close();  // Close current active window
		
		//Thread.sleep(10000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
