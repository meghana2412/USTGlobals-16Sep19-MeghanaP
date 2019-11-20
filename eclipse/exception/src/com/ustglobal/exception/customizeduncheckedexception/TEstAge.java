package com.ustglobal.exception.customizeduncheckedexception;

public class TEstAge {

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		Validator v = new Validator();
		try
		{
		v.verify(17);
		}
		catch(InvalidAgeException ie)
		{
			System.out.println("exception occured");
		}
		v.verify(12);
		System.out.println("main ended");
	}
}
