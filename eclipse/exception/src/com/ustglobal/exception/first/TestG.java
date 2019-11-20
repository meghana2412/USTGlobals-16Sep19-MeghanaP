package com.ustglobal.exception.first;

public class TestG {

	public static void main(String[] args) {
		System.out.println("main started");
		
		PayTM p = new PayTM();
		try
		{
		p.book();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught in amein method");
		}
		finally {
			System.out.println("executed finally");
		}
		
		System.out.println("main ended");
	}
}
