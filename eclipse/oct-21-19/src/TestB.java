
public class TestB {
public static void main(String[] args) {
	Cow c = new Cow();
	c.name= "ganga";
	c.color= "white and black";
	
	System.out.println("Cow name is "+c.name);
	System.out.println("Cow color is "+c.color);
	
	c.eat();
	c.sleep();
			
	System.out.println("******************************");	
	
	Cow c1 = new Cow();
	c1.name= "thunga";
	c1.color= "white and gray";
	
	System.out.println("Cow name is "+c1.name);
	System.out.println("Cow color is "+c1.color);
	
	c1.eat();
	c1.sleep();
}

}
