package patternofname;
import java.util.*;

class InvalidException extends Exception
{
	public InvalidException(String msg)
	{
		super(msg);
	}
}

class ATM
{
	private int  accno=1111;
	private int pass=1212;
	
	private int useracc;
	private int userpass;
	
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the account number and passward");
		 useracc=s.nextInt();
		 userpass=s.nextInt();	
	}
	public void verify()throws InvalidException
	{
		if(accno==useracc && pass==userpass)
		{
			System.out.println("collect ur cash");
		}
		else
		{
			InvalidException ie=new InvalidException("invalid accnum and password");
			//System.out.println("invalid accnum and password");
			System.out.println(ie.getMessage());
			throw ie;
	}
	
}
}

class Bank
{
	public void initiate()
	{
		ATM at=new ATM();
		try
		{
		at.input();
		at.verify();
		}
		catch(InvalidException ie)
		{
			try
			{
			at.input();
			at.verify();
			}
			catch(InvalidException iee)
			{
				try
				{
				at.input();
				at.verify();
				}
				catch(InvalidException i)
				{
					System.out.println("your account is blocked");
				}
			}
		}
	}
}

public class ApplicationOnRto {

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.initiate();

	}

}
