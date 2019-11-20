class Ternary3
{
	public static void main(String[] args)
	{
		int a =140;
		int b=200;
		int c =30;
		int d = (a>b)&&(a>c)?a:(b>c)? b: c;
		System.out.println(d);
	}
}