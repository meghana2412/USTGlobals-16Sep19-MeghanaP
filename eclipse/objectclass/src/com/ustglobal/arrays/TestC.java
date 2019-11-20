package com.ustglobal.arrays;

public class TestC {
	
	public static void main(String[] args) {
		
	String[] string1 = {"megha","pavan","ramesha"};

	receive(string1);
	String[] values = getString();
	
	for (String val : values)
	{
		System.out.println(val);
	}
}
static void receive(String[] string2)
{
	for(String string : string2)
	{
		System.out.println(string);
	}
}
static String[] getString()
{
	String[] values = {"sachin","manjula","mahesh"};
	return values;		
}

}
