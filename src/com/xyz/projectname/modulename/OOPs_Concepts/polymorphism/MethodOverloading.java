package com.xyz.projectname.modulename.OOPs_Concepts.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		addition(10, 20);
		
		addition(10, 20, 45);
		
		addition(10, "BYMAT", 20);
		
		
	}
	
	// Same method, with same argu/Parameter but should have differenet data types 
	
	public static void addition(int a, int b) {
		
		System.out.println(a+b);
	}

	public static void addition(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
	
	public static void addition(int a, String b, int c) {
		
		int d = a+c;
		System.out.println( d);
		System.out.print( b);
	}
	
	public static void addition(int a, int b, int c, boolean d) {
		
		System.out.println(a+b+c);
	}

	public static void addition(int a, int b, int c, int d) {
		
		System.out.println(a+b+c+d);
	}
	
	
}
