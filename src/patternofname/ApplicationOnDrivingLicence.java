package patternofname;

import java.util.Scanner;

class UnderAge extends Exception
{
	public UnderAge(String msg)
	{
		super(msg);
	}
	public void he()
	{
		System.out.println("hello");
	}
}
class Overage extends Exception
{
	public Overage(String msg)
	{
		super(msg);
	}
}
class Applicate
{
	int age;
	
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		age=s.nextInt();
	}
	public void verify()throws UnderAge,Overage
	{
		if (age>60)
		{
			UnderAge ua=new UnderAge("not eligible");
			
			System.out.println(ua.getMessage());
			throw ua;
		}
		else if(age<18)
		{
			Overage oa =new Overage("your are too young not eligible");
			System.out.println(oa.getMessage());
			throw oa;
		}
		else
		{
			System.out.println("your eligible");
		}
	}
}
class RTO
{
	public void inti()
	{
		Applicate a=new Applicate();
		try
		{
		a.input();
		a.verify();
		}
		catch(UnderAge | Overage uo)
		{
			try
			{
			a.input();
			a.verify();
			}
			catch(UnderAge | Overage u)
			{
				System.out.println("your application is blockked");
			}
		}
	}
}
public class ApplicationOnDrivingLicence {

	public static void main(String[] args) 
	{
		RTO r=new RTO();
		r.inti();

	}

}
