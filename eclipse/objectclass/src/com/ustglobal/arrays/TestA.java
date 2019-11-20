package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		/*for(int i = 0; i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}*/
		
		for(int i : nums)
		{
			System.out.println(i);
		}
		System.out.println("*************************");
		
		char[] ch = {'a','b','c','d'};
		for(int i = 0; i <ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("**************************");
		for(int c : ch)
		{
			System.out.println(c);
		}
		
		System.out.println("******************");
		boolean[] b = {true,false,true,false};
		for(int i =0; i<b.length ; i++)
		{
			System.out.println(i);
		}
		System.out.println("********************");
		for(int bool : b)
		{
			System.out.println(bool);
		}
		System.out.println("*****************");
		byte[] byt = {1,3,3,5};
		for(int i = 0; i <byt.length; i++)
		{
			System.out.println(i);
		}
		System.out.println("***************");
		for(int by : byt)
		{
			System.out.println(by);
		}
		System.out.println("*****************");
		double[] doub = {1.2,3.6,3.7,5.8};
		for(int i = 0; i <byt.length; i++)
		{
			System.out.println(i);
		}
		System.out.println("***************");
		for(double d : doub)
		{
			System.out.println(d);
		}
		System.out.println("*****************");
		String[] string1 = {"megha","pavan","sachi"};
		for(int i = 0; i <byt.length; i++)
		{
			System.out.println(i);
		}
		System.out.println("***************");
		for(String string2 : string1)
		{
			System.out.println(string2);
		}
	}
	
}
