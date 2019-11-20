package com.ustglobal.hasarelation.weak;

public class TestA {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name= "meghana");
		p.sleep();
		p.eat();
		System.out.println("************************");
		p.m.write();      // has-a realtion
		System.out.println(p.m.color);
	}
}
