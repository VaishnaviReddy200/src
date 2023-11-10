package patternofname;

import java.util.Scanner;

class Class
{
	public void alpha()//throws Exception
	{
		System.out.println("connection started succesfully");
		Scanner s=new Scanner(System.in);
		try
		{
		System.out.println("plese enter an numerator");
		int num=s.nextInt();
		System.out.println("please enter an denomerator");
		int den=s.nextInt();
		
		int res=num/den;
		
		System.out.println("the result is : " +res);
		}
		
		catch(Exception e)
		{
			System.out.println("exception handled in alpha");
			throw e;
		}
		finally//finally dominating throw and executes all statements in finally block 
		{
		
		System.out.println("connection termination in alpha");
		
		}
	}
}

public class Exception2 {

	public static void main(String[] args) 
	{
		
		System.out.println("connecton estsblished in main");
		try
		{
		Class c=new Class();
		c.alpha();
		}
		catch(Exception e)
		{
			System.out.println("exception is handled in main");
		}
		System.out.println("connecton established in main alph");
		
	}

}
