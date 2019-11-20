package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet();
		hs.add("Vijay");
		hs.add("Megha");
		hs.add("PAvan");
		
		System.out.println(" *********Using for each");
		
		for ( Object o : hs)
		{
			System.out.println(o);
			
		}
		
		System.out.println(" ***************8using iterator");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
	}
}
