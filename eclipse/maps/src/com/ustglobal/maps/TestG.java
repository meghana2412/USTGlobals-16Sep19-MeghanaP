package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {

		Employee e1 = new Employee(4,"Pavan", 77.45);
		Employee e2 = new Employee(2,"Meghana", 87.45);
		Employee e3 = new Employee(6,"ghana", 67.45);
		Employee e4 = new Employee(5,"sanmathi", 97.45);
		Employee e5 = new Employee(3,"megha", 27.45);
		Employee e6 = new Employee(8,"hana", 47.45);
		Employee e7 = new Employee(1,"amogha", 17.45);
		Employee e8 = new Employee(9,"amrutha", 7.45);
		Employee e9 = new Employee(7,"mogha", 75.45);

		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1= new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2= new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);

		ArrayList<Employee> first = hm.get("first");

		System.out.println("************first ,manager details*************");

		Iterator<Employee> it = first.iterator();
		while(it.hasNext()==true)
		{
			Employee e = it.next();
			System.out.println("id is : "+e.id);
			System.out.println("name is : "+e.name);
			System.out.println("percentage is : "+e.salary);
			System.out.println("");
		}

		ArrayList<Employee> second = hm.get("second");

		System.out.println("************second manager details*************");

		Iterator<Employee> it1 = second.iterator();
		while(it1.hasNext()==true)
		{
			Employee e = it1.next();
			System.out.println("id is : "+e.id);
			System.out.println("name is : "+e.name);
			System.out.println("percentage is : "+e.salary);
			System.out.println("");
		}
	}
}
