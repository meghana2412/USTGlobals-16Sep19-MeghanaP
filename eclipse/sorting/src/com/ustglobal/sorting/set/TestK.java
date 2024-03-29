package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(43);
		pq.add(12);
		pq.add(24);
//		we should add only generics, and null also not supported.
		
		System.out.println("********using iterator***********");
		Iterator <Integer> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(pq.poll());
		}
		System.out.println("After poll : "+pq);
	}
}
