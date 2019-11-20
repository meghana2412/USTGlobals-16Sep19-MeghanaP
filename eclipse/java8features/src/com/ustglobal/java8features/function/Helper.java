package com.ustglobal.java8features.function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Helper {
		
	void displayAllStudentData(ArrayList<Student> al)
	{
		System.out.println("**************all the student details******88");
		Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("id is : "+s.id);
			System.out.println("name is : "+s.name);
			System.out.println("percentage  is : "+s.percentage);
			System.out.println("");
		}
	}
	
	
	void displayfailedStudent(ArrayList<Student> al)
	{
		System.out.println("***********failed studends********");

		List<Student> l = al.stream().filter(student -> student.percentage <40).
				                                   collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()==true)
		{
			Student s1 = it.next();
			System.out.println("Id is : "+s1.id);
			System.out.println("name is : "+s1.name);
			System.out.println("percentage is : "+s1.percentage);
			System.out.println("");
		}
	}
	
	void displayPassedStudent(ArrayList<Student> al)
	
	{
		List<Student> l = al.stream().filter(student -> student.percentage > 40).
				                                   collect(Collectors.toList());
		
		
		Comparator<Student> cmp = (s1, s2) ->
		{
			if(s1.percentage>s2.percentage)
			{
				return 1;
				
			}
			else if(s1.percentage<s2.percentage)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		
		System.out.println("***************Topper is**************");
		Student s  = al.stream().max(cmp).get();
		System.out.println(s.percentage);
		System.out.println("");
		
		System.out.println("****passed studentd***********");
		Iterator<Student> it = l.iterator();
		while(it.hasNext()==true)
		{
			Student s2 = it.next();
			System.out.println("Id is : "+s2.id);
			System.out.println("name is : "+s2.name);
			System.out.println("percentage is : "+s2.percentage);
			System.out.println("");
		}
	}
	
	
	
}
