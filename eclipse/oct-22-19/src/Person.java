
public class Person {
	String name;
	int age;

	Person (String pname, int page)
	{
		name = pname;
		age = page; 
	}
	public static void main(String[] args) 
	{
		Person p1 = new Person("Megha" , 21);
          System.out.println(p1.name);
          System.out.println(p1.age);
          
          Person p2 = new Person("sanmathi" , 22);
          System.out.println(p2.name);
          System.out.println(p2.age);
          
          Person p3 = new Person("Sachin" , 19);
          System.out.println(p3.name);
          System.out.println(p3.age);
	}

}
