package com.xyz.projectname.modulename.OOPs_Concepts.abstraction;

public abstract class RBI_Bank {
	
	public double rateofInterest_variable = 9.00;
	
	public double rateOfInterest_homeLoan_NonStatic() {  // Interface not allows non static method 
		
		System.out.println("RBI Rate of Interest_homeLoan");
		
		return 5.8;
	}

	public abstract double rateOfInterest_abstractmethod();  // Interface allows this 
	
	public static double creditCardInterest_StaticMethod() {  // Interface allows static method 
		
		System.out.println("RBI creditCardInterest");
		
		return 8.8;
	}
	
	
}
