package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo{

	public static void main(String[] args) {
		Demo d = new Demo();

		//Private ( not possible because it is a private member of other class).
		/*
		 * System.out.println(d.a); 
		 */	
		//Default
		System.out.println(d.b);
		d.sub();
		
		Sample s = new Sample();

		//Protected
		System.out.println(s.c);
		s.mul();

		//Public
		System.out.println(d.name);
		d.div();
	}
}
}
