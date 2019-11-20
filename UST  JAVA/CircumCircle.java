class  CircumCircle
{
	public static void main(String[] args)
	{
		double a= 4;
		double circumference= circumferenceOfcircle(a);
		System.out.println("circumference of circle is "+circumference);
		boolean result = oddEven(25);
		System.out.println(result);
	}
	static double circumferenceOfcircle(double r)
	{
		double circum = 2*3.14* r;
 			return circum;
	}
	static boolean oddEven(int number)
	{
		if(number%2 == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}