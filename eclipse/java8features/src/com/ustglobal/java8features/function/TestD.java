package com.ustglobal.java8features.function;

import java.util.function.Consumer;

public class TestD {

	public static void main(String[] args) {
		
		Consumer<Student> c = s -> 
		{
		 System.out.println("id is : "+s.id);
		 System.out.println("name is : "+s.name);
		 System.out.println("percentage is : "+s.percentage);
		 System.out.println("********************************");
		};
		Student s1 = new Student(2,"meghana",67.9);
		c.accept(s1);
	}
}
