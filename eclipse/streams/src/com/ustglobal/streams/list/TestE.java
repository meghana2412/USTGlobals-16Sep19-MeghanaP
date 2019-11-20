package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(23);
		marks.add(24);
		marks.add(27);
		marks.add(34);
		marks.add(86);	
		
		Comparator<Integer> cmp = (m1,m2) ->
				{
					if(m1>m2)
					{
						return 1;
					}
					else if(m1<m2)
					{
						return -1;
					}
					else
					{
						return 0;
					}
				};
		long noOfFailedStudents = marks.stream().filter(i -> i <40).count();
		
		System.out.println("number of failed students are : "+noOfFailedStudents);
		System.out.println("");
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println("minimum marks is : "+i);
		
		Integer i1 = marks.stream().max(cmp).get();
		System.out.println("maximum marks is : "+i1);
		

		

	}
}
