package com.ustglobal.hasarelation.weak;

public class TestB {

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.company);
		c.runs();
		System.out.println("**********");
		c.ms.plays();     // HAS -A relation.
		System.out.println(c.ms.type);
	}
}
