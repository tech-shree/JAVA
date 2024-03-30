import java.util.*;
class Thr extends Thread
{
	int a,b;
	Thr(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		for(int i=a; i<=b;i++)
		{
			try
			{
				//Thread.sleep(1000);
			}
			catch(Exception e){}
			if(i%2!=0)
			{
				System.out.println("ChildThread"+i);
			}
		}
	}
}
class TH1Lab
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		Thr th=new Thr(m,n);
		th.start();
		
		for(int i=m; i<=n;i++)
		{
			try
			{
				th.join();
			}
			catch(Exception e){}
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			if(i%2!=0)
			{
				System.out.println("MainThread"+i);
			}
		}
	}
}

		