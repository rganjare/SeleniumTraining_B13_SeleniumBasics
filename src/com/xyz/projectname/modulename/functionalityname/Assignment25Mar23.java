package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment25Mar23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(ops);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		//*******************************Enter Details for Name, Address, Email and Phone**************************************
		String firstName = "Pallav";
		String lastName = "Bhattacharya";
		String address = "804- Viva E\nCasa Rio, Palava\nDombivli East";
		String email = "pallav.bhattacharya88@gmail.com";
		String phone = "8879325011";
		
		driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys(firstName);
		System.out.println("Entered the First name as: " +firstName);
		
		driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys(lastName);
		System.out.println("Entered the Last name as: " +lastName);
		
		driver.findElement(By.xpath("//*[@ng-model=\"Adress\"]")).sendKeys(address);
		System.out.println("Entered the Address name as: " +address);
		
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys(email);
		System.out.println("Entered the Email Address as: " +email);
		
		driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys(phone);
		System.out.println("Entered the Phone No as: " +phone);
		
		//*******************************Enter Details for Gender and Hobbies**************************************
		String gender = "Male";
		String hobbyCricket = "Yes";
		String hobbyMovies = "Yes";
		String hobbyHockey = "No";
		
		
		if(gender == "Male") {
			driver.findElement(By.xpath("//*[@value=\"Male\"]")).click();
			System.out.println("Gender Selected is: " +gender);
		} 
		else {
			driver.findElement(By.xpath("//*[@value=\"FeMale\"]")).click();
			System.out.println("Gender Selected is: " +gender);
		}
		
		if(hobbyCricket == "Yes") {
			driver.findElement(By.xpath("//*[@value=\"Cricket\"]")).click();
			System.out.println("Cricket is one of the Hobbies");
		}
		if(hobbyMovies == "Yes") {
			driver.findElement(By.xpath("//*[@value=\"Movies\"]")).click();
			System.out.println("Watching Movies is one of the Hobbies");
		}
		if(hobbyHockey == "Yes") {
			driver.findElement(By.xpath("//*[@value=\"Hockey\"]")).click();
			System.out.println("Hockey is one of the Hobbies");
		}
				
		
		//*******************************Enter Details for Language Skill and Country**************************************
		String skillsSet = "SQL";
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='English']")).click();
		Thread.sleep(3000);
		
		
		WebElement skillsOption = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select skills = new Select(skillsOption);
		skills.selectByValue(skillsSet);
		System.out.println("Skills selected is: " +skillsSet);
		
//		driver.findElement(By.xpath("//*[@aria-labelledby=\"select2-country-container\"]")).click();
//		driver.findElement(By.xpath("//*[@class=\"select2-search__field\"]")).sendKeys("India" +Keys.ENTER);
		
		
		
		//*******************************Enter Details for DOB**************************************
		String dobYear = "1995";
		String dobMonth = "December";
		String dobDay = "15";
		
		WebElement yearOfBirth = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select year = new Select(yearOfBirth);
		year.selectByValue(dobYear);
		
		WebElement monthOfBirth = driver.findElement(By.xpath("//*[@placeholder=\"Month\"]"));
		Select month = new Select(monthOfBirth);
		month.selectByValue(dobMonth);
		
		WebElement dateOfBirth = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select date = new Select(dateOfBirth);
		date.selectByValue(dobDay);
		
		System.out.println("DOB selected is: " +dobYear +"-" +dobMonth +"-" +dobDay);
		

		//*******************************Enter Details for Password**************************************
		String password = "DummyPassword";
		
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(password);
		System.out.println("Password have been entered as: " +password);
		
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		System.out.println("Submit have been clicked");
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Browser have been closed");

	}

}

