package com.ustglobal.exception.first;

public class TestD {

	public static void main(String[] args) {

		System.out.println("main started");

		int[] a = { 10,20,30};
		int b= 10;

		try
		{
			System.out.println(b/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("number divided by zero");
		}
		
		
		try
		{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("index not found");
		}

		System.out.println("main ended");
	}
}
