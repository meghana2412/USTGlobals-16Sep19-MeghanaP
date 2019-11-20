package com.ustglobal.exception.first;

public class PVR {

	public void book()
	{
		System.out.println("booking started");
	
	try
	{
		int b = 10/0;
		System.out.println(b);
		System.out.println("logic for booking");
		System.out.println("booking confirmed");
	}
	catch(ArithmeticException ae)
	{
		System.out.println("booking failed");
		throw ae;
	}
}
}