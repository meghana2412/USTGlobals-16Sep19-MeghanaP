package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
 public static void main(String[] args) {
	System.out.println("Scannerclass");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age");
	int age = sc.nextInt();
	System.out.println("Age is "+age);
	
	System.out.println("Enter name");
	String name = sc.next();
	System.out.println("Name is :"+name);
	
		/*
		 * System.out.println("Enter middlename"); String middlename = sc.nextLine();
		 * System.out.println("middlename is : "+middlename);
		 */
	System.out.println("are u a girl");
	boolean female = sc.nextBoolean();
	System.out.println("gender is female ");
}
}
