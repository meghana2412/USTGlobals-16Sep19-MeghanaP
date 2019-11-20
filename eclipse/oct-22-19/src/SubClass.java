
public class SubClass extends SuperClass{
	
	String s = "subclass variable";
	
	SubClass()
	{
		super();

		System.out.println("subclass constructor");
	}
	
	void getData()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*********************");
		super.superClassMethod();

	}
	
}
