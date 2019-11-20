package com.ustglobal.accessmodifier.pkg2;

public class Run {

	public static void main(String[] args) {
		Demo d = new Demo();
		
		//Private ( not possible because it is a private member of other class).
		/*
		 * System.out.println(d.a); 
		 */	
		//Default
		System.out.println(d.b);
		d.sub();
		
		//Protected
		System.out.println(d.c);
		d.mul();
		
		//Public
		System.out.println(d.name);
		d.div();
		}
}
