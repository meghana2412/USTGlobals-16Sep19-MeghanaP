package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "veeru"));
		al.add(new Employee(2, "manasa"));
		al.add(new Employee(3, "raveesh"));
		al.add(new Employee(4, "simha"));
		
		Comparator<Employee> cmp = (e1, e2) ->
		{
			return e1.name.compareTo(e2.name);
		};
		
		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		
		System.out.println("soted ------------>");

		Iterator<Employee> it = al.iterator();
		while(it.hasNext()==true)
		{
			Employee e = it.next();
			System.out.println("Id is : "+e.id);
			System.out.println("name is : "+e.name);
			System.out.println("");
		}
		
	}
}
