package com.ustglobal.objectclass;

public class TestG {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Megha",245674);
		
		Employee e2 = new Employee(2,"Manasa",4244);
		
		Employee e3 = new Employee(1,"Megha",245674);

		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e1));
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);


	}
}
