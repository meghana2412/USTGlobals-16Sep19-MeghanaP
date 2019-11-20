
public class TestC {
	public static void main(String[] args) {
		Person .color = "white";
		Person.sleep();
		System.out.println("Person color "+ Person.color);

		Person p = new Person();
		p.age = 21;
		p.name = "Megha";
		
		System.out.println("Person age is= "+p.age);
		System.out.println("Person name is= "+p.name);
		
		p.eat();
		p.walk();
		
		System.out.println("*********************************");
		
		Person .color = "brown";
		Person.sleep();
		System.out.println("Person color "+ Person.color);

		Person p1 = new Person();
		p1.age = 22;
		p1.name = "Pavan";
		
		System.out.println("Person age is= "+p1.age);
		System.out.println("Person name is= "+p1.name);
		
		p1.eat();
		p1.walk();

		
	}
}
