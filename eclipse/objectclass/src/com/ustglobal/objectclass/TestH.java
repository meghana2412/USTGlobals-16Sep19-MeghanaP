package com.ustglobal.objectclass;

public class TestH {
public static void main(String[] args) throws CloneNotSupportedException {
	Person p1= new Person(1,"ajay");
		p1.id=2;
	p1.name="vijay";
	System.out.println("p1 id : "+p1.id);
	System.out.println("p1 name is :"+p1.name);
	System.out.println("p1 id : "+p1.id);
	System.out.println("p1 name is :"+p1.name);
	
	
	Object o = p1.clone();
	Person p2 = (Person) o;
	p2.id = 200;
	p2.name="sunil";
	
	System.out.println("*********AFTER CLONING*********");
	System.out.println("p1 id : "+p1.id);
	System.out.println("p1 name is :"+p1.name);
	
	System.out.println("p2 id is "+p2.id);
	System.out.println("p2 name is "+p2.name);

}
}
