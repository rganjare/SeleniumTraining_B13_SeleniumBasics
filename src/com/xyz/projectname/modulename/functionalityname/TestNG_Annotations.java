package com.xyz.projectname.modulename.functionalityname;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("I am in the beforeClass() method");
		//System.out.println("Launching the Browser");
		//3
	}
	

	// 600 --1 500 Passed , 100 Failed , 2 - 100 -- Yes Or No
	
	@BeforeMethod
	public static void beforeTest() {
		
		System.out.println("I am in the beforeTest() method");
		System.out.println("Launching the Browser"); // Pre- requiste
	}
	
	@Test(priority=2)  // Test case
	public static void testCase1() { 
		
		System.out.println("Hello TestNG-testCase_1");
	}
	
	@Test (priority=2) // Test case
	public static void testCase3() { 
		
		System.out.println("Hello TestNG-testCase_3");
		
		Assert.assertEquals("BYMAT Automation", "BYMATAutomation", "Text is not matching"); //1
		
		System.out.println("Hello Test NG");
		
		Assert.assertEquals(true, true); //2
		
		System.out.println("Hello Test NGsfsfdf");
		
		Assert.assertEquals(5, 6, "The numbers are not equals" ); //3
		
	}
	
	@Test(priority= -2)  // Test case
	public static void testCase4() { 
		
		System.out.println("Hello TestNG-testCase_4");
	}
	
	@Test (priority=0) // Test case
	public static void testCase5() { 
		
		System.out.println("Hello TestNG-testCase_5");
		
		Assert.assertEquals("BYMATAutomation", "BYMATAutomation", "Text is not matching"); //1
		
		System.out.println("Hello Test NG");
		
		Assert.assertEquals(true, true); //2
		
		System.out.println("Hello Test NGsfsfdf");
		
		Assert.assertEquals(5, 6, "The numbers are not equals" ); //3
	}
	
	@Test(priority= 3)  // Test case
	public static void testCase2() { 
		
		System.out.println("Hello TestNG-testCase_2");
	}
	
	@Test(priority=-1)  // Test case
	public static void testCase6() { 
		
		System.out.println("Hello TestNG-testCase_6");
	}
	
	@AfterMethod
	public static void afterTest() {
		System.out.println("I am in the afterTest() method");
		System.out.println("Closing the Browser"); // // Post- requiste
		System.out.println("**********************************");
	}
	
//	@AfterClass
//	public static void afterClass() {
//		
//		System.out.println("I am in the afterClass() method");
//		//System.out.println("Launching the Browser");
//	}


}
