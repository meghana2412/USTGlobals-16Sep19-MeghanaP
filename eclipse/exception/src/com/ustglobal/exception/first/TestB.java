package com.ustglobal.exception.first;

public class TestB {

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		int a = 10;
		  int b= 1;
		try 
		{
		 b = a/0;

		 System.out.println("Hello");
		 System.out.println("happy kannada rajyothsava");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("number is divided by zero");
		}
		
		System.out.println(b);

		System.out.println("main ended");
	}
}
