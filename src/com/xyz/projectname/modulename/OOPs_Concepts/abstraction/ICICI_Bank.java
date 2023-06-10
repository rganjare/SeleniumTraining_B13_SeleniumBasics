package com.xyz.projectname.modulename.OOPs_Concepts.abstraction;

public class ICICI_Bank extends RBI_Bank {

public double rateOfInterest_homeLoan_NonStatic() {
		
		System.out.println("ICICI_Bank ROInterest_homeLoan");
		
		return 7.9;
	}

@Override
public double rateOfInterest_abstractmethod() {
	rateofInterest_variable = 10.25 ;
	System.out.println(rateofInterest_variable);
	return rateofInterest_variable;
}


}
