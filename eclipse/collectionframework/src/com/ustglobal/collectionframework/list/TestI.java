package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {

		Stack st = new Stack();
		st.add(12);
		st.add(34.6);
		st.add("more");
		st.add(true);
		st.add(null);
		
		System.out.println("==============uding for loop========");
		for(int i = 0; i<st.size(); i++)
		{
			System.out.println(st.get(i));
		}
		
		System.out.println("=======using for each====");
		Iterator it = st.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			 System.out.println(o);
		}
		
		System.out.println("=========using list itertor=========");
		ListIterator lt = st.listIterator();
		while(lt.hasNext())
		{
			Object o = lt.next();
			System.out.println(o);
		}
		
		ListIterator li1 = st.listIterator();
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
