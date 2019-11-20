package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(2,"Meghana", 87.45);
		Student s2 = new Student(4,"Pavan", 77.45);
		Student s3 = new Student(6,"ghana", 67.45);
		Student s4 = new Student(5,"sanmathi", 97.45);
		Student s5 = new Student(3,"megha", 27.45);
		Student s6 = new Student(8,"hana", 47.45);
		Student s7 = new Student(1,"amogha", 17.45);
		Student s8 = new Student(9,"amrutha", 7.45);
		Student s9 = new Student(7,"mogha", 75.45);
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1= new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2= new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> first = hm.get("first");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()==true)
		{
			Student s = it.next();
			System.out.println("id is : "+s.id);
			System.out.println("name is : "+s.name);
			System.out.println("percentage is : "+s.percentage);
			System.out.println("");
		}
	}
}
