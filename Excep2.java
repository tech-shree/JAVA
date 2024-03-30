/*2.Write a java program to read two numbers x and y and calculate x/(xy). The program should check the value of xy. 
Before dividing with x, it should throw an exception if xy is zero. In the exception handler the program should display appropriate 
message to the user.*/
import java.util.*;
class Excep2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		double d=0.0;
		double a=in.nextDouble();
		double b=in.nextDouble();
		try
		{
			if(a==b)
			{
				throw new ArithmeticException();
			}
			else
			{
				d=a/b;
				System.out.println("Result="+d);
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter a Valid Number"+e);
		}
	}
}