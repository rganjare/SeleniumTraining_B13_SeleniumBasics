package com.xyz.projectname.modulename.accessModifies;

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		System.out.println("############### Access_Modifiers_ Public #################");
		Access_Modifiers_Public amp = new Access_Modifiers_Public();
		
		amp.access_Modifiers_Public_public_member();
		amp.access_Modifiers_Public_default_member();
		amp.access_Modifiers_Public_protected_member();
		
		Access_Modifiers_Public.access_Modifiers_Public_public_member_static();
		Access_Modifiers_Public.access_Modifiers_Public_default_member_static();
		Access_Modifiers_Public.access_Modifiers_Public_protected_member_static();
		
		
		System.out.println("############### Access_Modifiers_Default #################");
		
		Access_Modifiers_Default amd = new Access_Modifiers_Default();
		
		amd.access_Modifiers_Default_public_member();
		amd.access_Modifiers_default_default_member();
		amd.access_Modifiers_default_protected_member();
		
		Access_Modifiers_Default.access_Modifiers_default_public_member_static();
		Access_Modifiers_Default.access_Modifiers_default_default_member_static();
		Access_Modifiers_Default.access_Modifiers_default_protected_member_static();

	}

}

