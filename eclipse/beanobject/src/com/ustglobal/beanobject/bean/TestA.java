package com.ustglobal.beanobject.bean;

public class TestA {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("Meghana");
		s.setRollNo(3245678);
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(1);
		e.setSalary(34567);
		e.setName("Meghana");
		e.setDesignation("developer");
		e.setDept("EEE");
		db.save(e);
	}
}
