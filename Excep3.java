/*3.Write an exception handling java program to print the index position of an existing integer array.
 The index value will be entered by user. It will be handled by exception handler if index position is greater 
 then the size of array. In the exception handler the program should display appropriate message to the user.*/ 
import java.util.*; 
class Excep3
{
	public static void main(String args[])
	{
		int ind,i,value;
		//int arr[]=new int[5];
		int arr[]={12,8,4,2,1};
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Index Number:");
		ind=in.nextInt();
		try
		{
			if(ind>5)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			else
			{
				value=arr[ind];
				System.out.print("Value Of The Index:"+value);
			}
		}
		catch(Exception e)
		{
			System.out.println(e+"Please Enter the index within 5...");
		}
	}
}
		