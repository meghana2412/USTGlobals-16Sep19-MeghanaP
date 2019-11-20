package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(35);
		ts.add(9);
		ts.add(35);
//		ts.add("meghana"); we can add only generics in teeset: ClassCastException
//		ts.add(null); : NullPointerException
		

		System.out.println(" *********Using for each");

		for ( Object o : ts)
		{
			System.out.println(o);

		}

		System.out.println(" ***************using iterator");

		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);

		}
	}
}