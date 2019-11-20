
public class TestA 
{
	public static int add(int a, int b) 
	{
		System.out.println("add(int a , int b) method");
		return a +b ;
	}

	public static double add(double a, int b) 
	{
		System.out.println("add(double a , int b) method");
		return a + b;
	}

	public static void add(int a,byte b)
	{
		System.out.println("add(int a , byte b) method");
	}

	public int multiply(int a , int b)
	{
		System.out.println("multiply(int a , int b ) method");
		return a * b;
	}

	public int multiply(byte a , int b)
	{
		System.out.println("multiply(byte a , int b ) method");
		return a* b;
	}
	
	
	
	public static void main(int a) 
	{
		System.out.println("main (int a) method");
	}
	
	public static void main(String[] args) 
	{
       main(20);
      int add1 = add (10,20);
      System.out.println(add1);
      
      int add2 =  add(1,30);
      System.out.println(add2);
      
       int add3 = add(98,100);
       System.out.println(  add3);
       
       TestA t = new TestA();
       
      int mul1= t.multiply(12,5);
      System.out.println(mul1);
      
       int mul2 = t.multiply(11, 6);
       System.out.println(mul2);
	}
}
