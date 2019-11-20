package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestL {

	public static void main(String[] args) {
		
		Comparator<Employee1> comp = (e1,e2) ->
		{
			if(e1.height > e2.height)
			{
				return 1;
			}
			else if(e1.height < e2.height)
			{
				return -1;
			}
			else 
			{
				return 0;
			}
		};
		
		TreeSet<Employee1> ts = new TreeSet<> (comp);
		
		Employee1 e1 = new Employee1(4, "shravan", 5.8);
		Employee1 e2 = new Employee1(3, "ravan", 7);
		Employee1 e3 = new Employee1(2, "shrav",6);
		Employee1 e4 = new Employee1(1, "shreyan", 9);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("************using iterator**************");
		
		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext()== true)
		{
			Employee1 e = it.next();
			System.out.println("e id is : "+e.id);
			System.out.println("e name is : "+e.name);
			System.out.println("e salary is : "+e.height);
			System.out.println("");
		}
	}
}
