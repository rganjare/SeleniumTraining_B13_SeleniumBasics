package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

// CTRL+Shit+O
public class TestDropDownBox {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	   //ChromeDriver driver1 = new ChromeDriver(); 
	    
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://www.wikipedia.org/");
		System.out.println("User Navigated to Wikipedia Page");
		
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("BYMAT Automation");
		System.out.println("User entered the search text");
			 
		//Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")));
		
		WebElement dropdownBox = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Select sel = new Select(dropdownBox);
		
//		sel.selectByVisibleText("Magyar"); //p1
//		Thread.sleep(2000);
//		System.out.println("User selected Magyar language from dropdown box");
		
//		sel.selectByValue("ka"); //p2
//		Thread.sleep(3000);
//		System.out.println("User selected Hindi language from dropdown box");
		
		sel.selectByIndex(5); //p3
		Thread.sleep(3000);
		System.out.println("User selected Български language from dropdown box");
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		System.out.println("User clicked on search icon");
		
		
		Thread.sleep(5000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
