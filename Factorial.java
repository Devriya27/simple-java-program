class Factorial
{
	static long i=1;
	public static void main(String args[])
	{
		fact();
	}

	static void fact()
	{
		long out=1;
		for(int j=1;j<=i;j++)
		{
			out=out*j;
		}
		System.out.println(out);
		i++;
		fact();					//Recursion
	}

}
