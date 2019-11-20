package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortByCname sbc = new SortByCname();
		
		TreeSet<Customer> ts =new TreeSet<Customer>(sbc);
		ts.add(new Customer("Meghana",12,3458));
		ts.add(new Customer("Sindu",145,343567));
		ts.add(new Customer("KAvya",123,34598765));
		ts.add(new Customer("Arpitha",134,34587));

		System.out.println("*********** uding iterator********");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext())
		{
			Customer c = it.next();
			System.out.println("name is : "+c.name);
			System.out.println("id is : "+c.id);
			System.out.println("salary is : "+c.sal);
			System.out.println("");
		}
	}
}
