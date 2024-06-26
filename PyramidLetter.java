import java.util.*;
class PyramidLetter
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Char ");
		String a=in.nextLine();
		a=a.toUpperCase();
		int c=a.charAt(0);
		for(int i=c;i>64;i--)
		{
			for(int j=i;j>64;j--)
			{
				System.out.print((char) i);
			}
			System.out.println();

		}
	}
}