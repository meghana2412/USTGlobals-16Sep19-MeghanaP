package com.ustglobal.sungletonclass;

public class Test {

	public static void main(String[] args) {
		
		 MySingleton ms =  MySingleton.getDbConnection();
		 System.out.println(ms.s = "hello");
		 System.out.println("hashcode is : "+ms.hashCode());
		 
		 MySingleton mx = MySingleton.getDbConnection();
		 System.out.println(mx.s = "hi");
		 System.out.println("hashcode is : "+mx.hashCode());
		 
		System.out.println(ms.s);
		System.out.println(mx.s);
	}
}
