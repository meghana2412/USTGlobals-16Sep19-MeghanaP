class Factorial
{
	public static void main(String[] args)
	{
	   double result= factorialOfnumber(5);
	   System.out.println(	result);
	}
	static double factorialOfnumber( int num)
	{
		int fact =1;
 		for (int i =num ; i >=1; i--)
		{
			fact = fact*i;
			
		}
		return fact;
	}
}