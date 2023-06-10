package com.xyz.projectname.modulename.functionalityname;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// CTRL+Shift+O
public class GetAllValuesFromDropDownBox {
	
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
			 
//		
//		WebElement parent_dropdownBox = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
//		//Select sel = new Select(dropdownBox);
//		
//	  List<WebElement> dropDownvalues = parent_dropdownBox.findElements(By.tagName("option")); // Collections in Java
//		
//	  System.out.println("Total Number of languages available in dropdown box are: " +dropDownvalues.size()); // 70 Records
//	  System.out.println("******************************************" );
// 
//	  
//	  for(int i=0; i<dropDownvalues.size(); i++) { // 0 to 69 == 70 records
//
//		  System.out.println("Language name is:" +dropDownvalues.get(i).getText() );
//		  System.out.println("Language first getAttribute value is:" +dropDownvalues.get(i).getAttribute("value") );
//		  System.out.println("Language second getAttribute value is:" +dropDownvalues.get(i).getAttribute("lang") );
//		  System.out.println("******************************************" );
//	  }
	
		
//		// How to get the total links from the web page 
//		
//		 	List<WebElement> total_link =  driver.findElements(By.tagName("a"));
//		
//		  System.out.println("Total link available on Wikipedia page are: " +total_link.size()); 
//		  System.out.println("******************************************" );
//	 
//		  
//		  for(int i=0; i<total_link.size(); i++) { 
//			  System.out.println("Name of the link is:" +total_link.get(i).getText() );
//			  System.out.println("Title of the limk is:" +total_link.get(i).getAttribute("title") );
//			  System.out.println("The link is:" +total_link.get(i).getAttribute("href") );
//			  System.out.println("******************************************" );
//		  }
//		 
//		  
		//  How to get the values from perticular section
		  
		 WebElement parent_section =  driver.findElement(By.xpath("//*[@class=\"other-projects\"]"));
		  
		List<WebElement> child_elements = parent_section.findElements(By.tagName("a"));
		
		 System.out.println("Total child elements in a section are: " +child_elements.size()); 
		  System.out.println("******************************************" );
	 
		  
		  for(int i=0; i<child_elements.size(); i++) { 
			  System.out.println("Name of the child_elements is:" +child_elements.get(i).getText() );
			  System.out.println("The link of child_elements is:" +child_elements.get(i).getAttribute("href") );
			  System.out.println("******************************************" );
		  }
		
		 
		Thread.sleep(3000);
		driver.quit(); // Kill my instance 
		System.out.println("Browser has been closed");
	}
}
