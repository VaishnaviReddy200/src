package patternofname;
class Dollar implements Runnable
{
	public void run()
	{
	System.out.println("Activity 1 started");
	for (int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print("$");
		}
	}
	System.out.println();
	System.out.println("Activity 1 ended");
	}
}
class Number implements Runnable
{
	public void run()
	{
	System.out.println("************************************");
	
	System.out.println("Activity 2 started");
	
	for (int i=0;i<5;i++)
	{
		System.out.println(i);
	}
	
	try
	{
	Thread.sleep(5000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("Activity 2 ended");
	
	System.out.println("**************************************");
	}
}
class Alphabet implements Runnable
{
	public void run()
	{
		System.out.println("Activity 3 started");
		for(int i=65;i<70;i++)
		{
			System.out.println((char)i);
		}
		System.out.println("Activity 3 ended");

	}
}


public class MultithreadingRunnableInferfae 
{

	public static void main(String[] args)
	{
		Dollar d=new Dollar();
		Number n=new Number();
		Alphabet a=new Alphabet();
		
		Thread t=new Thread(d);
		Thread t1=new Thread(n);
		Thread t2=new Thread(a);
		
		t.start();
		t1.start();
		t2.start();
		
		

	}

}
