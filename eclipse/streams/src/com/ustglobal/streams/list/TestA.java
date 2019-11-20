package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(24);
		al.add(27);
		al.add(34);
		al.add(86);	
		
		List<Integer> l =
		al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		for(Integer i : l)
		{
			System.out.println(i);
		}
		
	}
}
