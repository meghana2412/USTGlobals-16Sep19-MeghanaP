
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost=100;
		p.color="black";
		p.brand="writo meter";
		
		System.out.println("Cost is "+p.cost);
		System.out.println("Color is "+p.color);
		System.out.println("Brand is "+p.brand);
		
		p.write();
		
		System.out.println("*************************************");
		Van v = new Van();
		v.cost = 500000;
		v.color = "black";
		
		System.out.println("cost is "+v.cost);
		System.out.println("color is "+v.color);
	
		v.move();
		
		System.out.println("88888888888888888888888888888");
		Van v1 = new Van();
		v1.cost= 490000;
		v1.color="white";
		
		System.out.println("cost is "+v1.cost);
		System.out.println("color is "+v1.color);
		
		v1.move();
		
	
	}
}
