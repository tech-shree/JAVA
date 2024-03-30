//Q2. Write a java program to create two threads. First thread should find the square of the number, second thread should find the sum of the digits of the number. 
import java.util.*;
class Sqr extends Thread
{
	int a,b;
	Sqr(int a)
	{
		this.a=a;
	}
	public void run()
	{
		b= a*a;
		System.out.println("Square"+r);
	}
	int getb()
	{
		return b;
	}
}
class Sum extends Thread
{
	int a;
	Sum(int a)
	{
		this.a=a;
	}
	public void run()
	{
		int r=a,x=0;
		while(r!=0)
		{
			x=x+r%10;
			r=r/10;
		}
		//System.out.println("Sum of digit"+x);
	}
}
class TH2Lab
{
	public static void main(String arg[])
	{
		int a=15;
		Sqr ob=new Sqr(a);
		//Sum ob1=new Sum(a);
		try
		{
			ob.join();
		}
		ob.start();
		System.out.println(ob.getb());
		//ob1.start();
	}
}
		