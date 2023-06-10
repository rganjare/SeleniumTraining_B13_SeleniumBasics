package com.xyz.projectname.modulename.functionalityname;

import com.xyz.projectname.modulename.accessModifies.Access_Modifiers_Public;

public class TestAccessModifiersInOtherPackage extends Access_Modifiers_Public{

	public static void main(String[] args) {
		
		Access_Modifiers_Public amp = new Access_Modifiers_Public();
		
		amp.access_Modifiers_Public_public_member(); // Non Static Methods
		
		
		Access_Modifiers_Public.access_Modifiers_Public_public_member_static();
		Access_Modifiers_Public.access_Modifiers_Public_protected_member_static();
		
		
		
		/// Access_Modifiers_Default amd = new Access_Modifiers_Default();

	}

}
