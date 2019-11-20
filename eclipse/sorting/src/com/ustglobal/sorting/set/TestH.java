package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestH {

	public static void main(String[] args) {
		 TreeSet<Employee> hs = new TreeSet();
		 hs.add( new Employee(12,"Meghana",98765));
		 hs.add(new Employee(31,"Pavan",87645));
		 hs.add(new Employee(43,"Sachin",45678));
		 hs.add(new Employee (56,"Vivek",345678));
		 hs.add(new Employee (56,"Vivek",345678));

		 
		 System.out.println("************using iterator************");
		 
		 Iterator<Employee> it = hs.iterator();
		 while(it.hasNext())
		 {
			 Employee e = it.next();
			 System.out.println("Id is : "+e.id);
			 System.out.println("NAme is : "+e.name);
			 System.out.println("Salary is : "+e.salary);
			 System.out.println(e);

			 System.out.println("");
		 }
		 
	}

}
