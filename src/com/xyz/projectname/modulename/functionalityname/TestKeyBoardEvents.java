package com.xyz.projectname.modulename.functionalityname;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

// CTRL+Shift+O
public class TestKeyBoardEvents {
	
	public static WebDriver driver; //interface
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(ops); 
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://jqueryui.com/spinner/");
		System.out.println("User Navigated URL");	
			
		Thread.sleep(2000);
		Actions act = new Actions(driver);  // Class ... Operation on Driver
		
//		Robot rb = new Robot(); // Java language Only.
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyPress(KeyEvent.VK_C);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform(); // CTRL+A+C == Copy all values from page
		System.out.println("CONTROL+A+C operation has been performed");
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		driver.findElement(By.xpath("//*[@id=\"spinner\"]")).click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform(); // Pasting the values in perticuler field
		System.out.println("CONTROL+V operation has been performed");
		
		Thread.sleep(5000);	
		
//		rb.keyPress(KeyEvent.VK_V);

//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_C);
//		rb.keyRelease(KeyEvent.VK_V);
		
		
	//	act.contextClick().perform(); // right click Operation
	//	System.out.println("Right Click operation has been performed");
		
		driver.switchTo().defaultContent(); //How to switch driver back to the original position
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).perform();
		System.out.println("Print command is triggered");
	
		Thread.sleep(10000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
