package com.xyz.projectname.modulename.OOPs_Concepts.encapsulation;

public class UpdateBankRecords {
	
	// Variables are private 
	
	private long account_no;
	private float account_balance= 1000000;
	private String accountOwner, home_address, email;
	private long mobileNumber;
	//private float deposit_amount=0;
	
//	public long getAccount_no() {
//		return account_no;
//	}
	
	public void setAccount_no(long account_no) { // Customer Account number -- 4353534533
		this.account_no = account_no;
	}
	
	public float getAccount_balance() {
		
		// SQL query to get the account balance for 
		// Select accountBalance from schemaname.TableName where customerAccount_number = account_no
		
		return account_balance;
	}
	
	public void setAccount_balance(float depositAmount) { // 10000
		// account_balance = 500000 ; // Select accountBalance from schemaname.TableName where customerAccount_number = account_no
		account_balance = account_balance + depositAmount;
		
		this.account_balance = account_balance;
	}
	
	public String getAccountOwner() {
		
		accountOwner = "Srikant"; // Select accountOwner from schemaname.TableName where customerAccount_number = account_no
		return accountOwner;
	}
	
//	public void setAccountOwner(String accountOwner) {
//		this.accountOwner = accountOwner;
//	}
	
	public String getHome_address() {
		
		home_address = "address"; // Select home_address from schemaname.TableName where customerAccount_number = account_no
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	
	public String getEmail() {
		
		//email = "test@emailaddress.com";
		return email;
	}
	public void setEmail(String email) {  // Customer new email address -- training@bymatAutomation.com
		
		//email_address = "address"; // update email from schemaname.TableName where customerAccount_number = account_no
		email = email;
		this.email = email;
	}
	
	public long getMobileNumber() {
		
		mobileNumber = 985034352;
		
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
