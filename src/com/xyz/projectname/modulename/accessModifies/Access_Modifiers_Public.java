package com.xyz.projectname.modulename.accessModifies;

public class Access_Modifiers_Public {

	
	public void access_Modifiers_Public_public_member() {
		
		System.out.println("I am in to the access_Modifiers_Public_public_member");
		
		access_Modifiers_Public_private_member();
	}
	
	void access_Modifiers_Public_default_member() {
		
		System.out.println("I am in to the access_Modifiers_Public_default_member");
	}
	
	protected void access_Modifiers_Public_protected_member() {
		
		System.out.println("I am in to the access_Modifiers_Public_protected_member");
	}
	
	private void access_Modifiers_Public_private_member() {
		
		System.out.println("I am in to the access_Modifiers_Public_private_member");
	}
	
	//################ Static members/Method/functions ########################
	
	public static void access_Modifiers_Public_public_member_static() {
		
		System.out.println("I am in to the access_Modifiers_Public_public_member_static");
	}
	
	static void access_Modifiers_Public_default_member_static() {
		
		System.out.println("I am in to the access_Modifiers_Public_default_member_static");
	} 
	
	protected static void access_Modifiers_Public_protected_member_static() {
		
		System.out.println("I am in to the access_Modifiers_Public_protected_member_static");
	}
	
	private static void access_Modifiers_Public_private_member_static() {
		
		System.out.println("I am in to the access_Modifiers_Public_private_member_static");
	}
	
}
