package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1, "Megha", 98.3);
		Student s2 = new Student(2, "Pavan", 89.3);
		Student s3 = new Student(3, "Meghana", 99.4);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i =0; i<al.size();i++)
		{
			Student s = al.get(i);
			System.out.println("id is : "+s.id);
			System.out.println("name is : "+s.name);
			System.out.println("percentage is : "+s.percentage);
		}
		
		System.out.println("*************88for each*************");
		for(Student s : al)
		{
			System.out.println(s);
		}
	}
}
