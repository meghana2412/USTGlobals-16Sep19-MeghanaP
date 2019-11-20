package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet();
		ls.add(34.2);
		ls.add(354.6);
		ls.add(89.9);
		ls.add(34.3);
		ls.add(975.3);
		
		
System.out.println("*********** for esch**********");
		
		for (Object o : ls)
		{
			System.out.println(o);
		}
		
		/*
		 * System.out.println("************ for loop********");
		 * 
		 * for ( int i = 0 ; i < ls.size(); i++) { System.out.println(i); }
		 */		
		System.out.println("************ using iterator*********");
		Iterator it = ls.iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
	}
}
