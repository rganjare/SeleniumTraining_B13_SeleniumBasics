package com.xyz.projectname.modulename.accessModifies;

public class TestVoidKeyword {

	public static void main(String[] args) {
		
		addition();
		
	int d =	addition1();
	System.out.println("Addition of two number with int return Type:" + d);
	}

	public static void addition() {
		System.out.println("Addition of two number:" + (1+3));
	}
	
	
	public static int addition1() {
		int a =1; int b=2; 
		
		int c = a+b;
		//System.out.println("Addition of two number:-" + c);
		
		return c;
		
	}
}
