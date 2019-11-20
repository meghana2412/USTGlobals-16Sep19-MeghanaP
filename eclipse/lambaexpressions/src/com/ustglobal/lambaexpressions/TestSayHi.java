package com.ustglobal.lambaexpressions;

public class TestSayHi {

	public static void main(String[] args) {
		
		SayHiInterface sayhi = () -> System.out.println("hi");
		sayhi.sayHi();

	}
}
