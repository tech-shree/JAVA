/*2.Write a java program to read two numbers x and y and calculate x/(xy). The program should check the value of xy. 
Before dividing with x, it should throw an exception if xy is zero. In the exception handler the program should display 
appropriate message to the user. */
import java.util.*;
class Excep_2
{
	public static void main(String args[])
	{
		int x,y,diff;double res=0.0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of x:");
		x=in.nextInt();
		System.out.print("Enter the value of y:");
		y=in.nextInt();
		diff=x-y;
		try
		{
			if(diff==0)
			{
				throw new ArithmeticException();
			}
			else
			{
				res=x/diff;
				System.out.println("Result="+res);
			}
		}
		catch(Exception e)
		{
			System.out.println(e+" 0 cannot divide x..");
		}
	}
}
			
		