package com.xyz.projectname.modulename.OOPs_Concepts.abstraction;

public class HDFC_Bank extends RBI_Bank {
	
	public double rateOfInterest_homeLoan_NonStatic() {
		
		System.out.println("HDFC_Bank ROInterest_homeLoan");
		
		return 7.4;
	}

	@Override
	public double rateOfInterest_abstractmethod() {
		System.out.println(rateofInterest_variable);
		
		// Code as per banking requirements using  the parent Abstract class variable 
		
		double newvalue = 10.25;
		
		return newvalue;
	}

	
	
}
