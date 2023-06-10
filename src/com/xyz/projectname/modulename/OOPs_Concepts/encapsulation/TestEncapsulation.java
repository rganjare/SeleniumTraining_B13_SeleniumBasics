package com.xyz.projectname.modulename.OOPs_Concepts.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		UpdateBankRecords br = new UpdateBankRecords();
		
		br.setAccount_no(535363632); 
		
		System.out.println(br.getAccount_balance());
		System.out.println(br.getAccountOwner() );
		System.out.println(br.getHome_address());
		System.out.println(br.getEmail());
		System.out.println(br.getMobileNumber());
		
	
		
		br.setEmail("Trainig@BymatAutomation.com");
		br.setAccount_balance(10000);
		
		System.out.println(br.getEmail());
		System.out.println(br.getAccount_balance());
		
		System.out.println("The customer "+br.getAccountOwner() + " is having account balance " +br.getAccount_balance() + " and his email address is " +br.getEmail()
		+" and his home address is "+br.getHome_address());
		
	}

}
