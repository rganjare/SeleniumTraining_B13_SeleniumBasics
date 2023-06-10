package com.xyz.projectname .modulename.functionalityname;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass_Example {
	
	
	@Test
	public static void loginToInstagram() {
		
		Assert.assertEquals("BYMATAutomation", "BYMATAutomation", "Text is not matching"); //1
		
		System.out.println("Hello Test NG");
		
		Assert.assertEquals(true, true); //2
		
		System.out.println("Hello Test NGsfsfdf");
		
		Assert.assertEquals(5, 6, "The numbers are not equals" ); //3
		
		Assert.assertTrue(5 == 5, "sdfsdfsfsdf");
		
		System.out.println("Hello Test NGsfsfdf");
	}

}
