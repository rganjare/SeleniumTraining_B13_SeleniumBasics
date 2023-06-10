package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestRadioButtonsAndTestCheckBox {

	public static void main(String[] args) {
	
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(ops); // Responsible to launch the chrome browser
	   
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // 10 sec
	    
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("User Navigated to Automationtesting Website");
		
		
		driver.findElement(By.xpath("//*[@value=\"Male\"]")).click();
		System.out.println("User selected the Male Radio button");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		System.out.println("User selected the Movies checkbox");
		
		
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");

	}

}
