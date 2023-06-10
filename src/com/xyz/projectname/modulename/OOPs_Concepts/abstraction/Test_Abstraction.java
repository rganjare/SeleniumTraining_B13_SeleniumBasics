package com.xyz.projectname.modulename.OOPs_Concepts.abstraction;

public class Test_Abstraction {

	public static void main(String[] args) {
		
		RBI_Bank rb = new HDFC_Bank();
		
		System.out.println(rb.rateOfInterest_homeLoan_NonStatic()); // Non Static Method from Abstract class
		System.out.println(rb.rateOfInterest_abstractmethod() );    // Abstract Method from Abstract class 
		System.out.println(rb.creditCardInterest_StaticMethod());   // Static Method from Abstract class 
		System.out.println(rb.rateofInterest_variable );            // Variable from Abstract class  
		
		
		System.out.println("************************************" );  
		RBI_Bank rb_icici = new ICICI_Bank();
		
		System.out.println(rb_icici.rateOfInterest_homeLoan_NonStatic()); // Non Static Method from Abstract class
		System.out.println(rb_icici.rateOfInterest_abstractmethod() );    // Abstract Method from Abstract class 
		System.out.println(rb_icici.creditCardInterest_StaticMethod());   // Static Method from Abstract class 
		System.out.println(rb_icici.rateofInterest_variable);            // Variable from Abstract class  
	}

}
