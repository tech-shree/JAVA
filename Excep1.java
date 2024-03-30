/*1.Write an exception handling java program to read two numbers n1, n2 and calculate and print the result of n1/n2. 
If n2 is Zero (0) then it will be handled by exception handler and again ask the value of n2. In the exception handler the 
program should display appropriate message to the user.*/
import java.util.*;
class Excep1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int d=0;
		int a=in.nextInt();
		int b=in.nextInt();
		try
		{
			d=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Please enter non-zero number"+e);
		}
		System.out.println("Result="+d);
	}
}
