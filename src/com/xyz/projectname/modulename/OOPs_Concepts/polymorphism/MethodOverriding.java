package com.xyz.projectname.modulename.OOPs_Concepts.polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		
		// Inheritance relation between classes
		// Object of Child class should be assign to the reference variable of the Parent class 
		
		System.out.println("***********HDFC_Bank****************");
		RBI_Bank rbi = new HDFC_Bank();
		System.out.println(rbi.rateOfInterest_homeLoan());
		System.out.println(rbi.rateOfInterest_PL());
		 
		 System.out.println("************ICICI_Bank***************");
		 RBI_Bank rbi_icici = new ICICI_Bank();
		 System.out.println(rbi_icici.rateOfInterest_homeLoan());
		 System.out.println(rbi_icici.rateOfInterest_PL()); 
		 
			System.out.println("************SBI_Bank***************");
			 RBI_Bank rbi_sbi = new SBI_Bank();
			System.out.println(rbi_sbi.rateOfInterest_homeLoan());
				System.out.println(rbi_sbi.rateOfInterest_PL()); 
				System.out.println(rbi_sbi.creditCardInterest()); 
				
				System.out.println("************SBI_Bank***************");
				SBI_Bank rbi_sbi1 = new SBI_Bank();
				System.out.println(rbi_sbi1.insurance() );
				System.out.println(rbi_sbi1.creditCardInterest());
				System.out.println(rbi_sbi1.rateOfInterest_homeLoan());
				System.out.println(rbi_sbi1.rateOfInterest_PL());
	}

}
