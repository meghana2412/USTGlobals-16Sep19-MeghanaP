package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(12);
		li.add(34.6);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("==============uding for loop========");
		for(int i = 0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("=======using for each====");
		Iterator it = li.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			 System.out.println(o);
		}
		
		System.out.println("=========using list itertor=========");
		ListIterator lt = li.listIterator();
		while(lt.hasNext())
		{
			Object o = lt.next();
			System.out.println(o);
		}
		
		ListIterator li1 = li.listIterator();
		System.out.println("-----------------------> Forward");
		while(li1.hasNext())
		{
			Object ob = li1.next();
			System.out.println(ob);
		}
		System.out.println("Backward <-------------------");
		
		while(li1.hasPrevious())
		{
			Object o = li1.previous();
			System.out.println(o);
		}
	}
}
