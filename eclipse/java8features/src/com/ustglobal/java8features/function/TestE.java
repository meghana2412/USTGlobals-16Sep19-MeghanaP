package com.ustglobal.java8features.function;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1,"megha",43.5));
		al.add(new Student(2,"sanju",85));
		al.add(new Student(5,"saighal",34));
		al.add(new Student(9,"zoya",95));
		al.add(new Student(2,"kurma",54));
		al.add(new Student(6,"poorvi",26));
		
		Helper h = new Helper();
		h.displayAllStudentData(al);
		h.displayfailedStudent(al);
		h.displayPassedStudent(al);
	}
}
