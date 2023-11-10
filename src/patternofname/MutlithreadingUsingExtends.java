package patternofname;
class Dollar1 extends Thread
{
	public void run()
	{
	System.out.println("Activity 1 started");
	for (int i=0;i<5;i++)
	{
		for(int j=i;j<5;j++)
		{
			System.out.println("$");
		}
	}
	System.out.println();
	System.out.println("Activity 1 ended");
	}
}
class Number1 extends Thread
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
class Alphabet1 extends Thread
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

public class MutlithreadingUsingExtends {

	public static void main(String[] args)throws Exception 
	{
		System.out.println("main thread started");
		System.out.println("resource started");
		Dollar1 d=new Dollar1();//thread object is created because of inheriting thread class
		Number1 n=new Number1();
		Alphabet1 a=new Alphabet1();
		
		System.out.println(d.isAlive());
		d.start();
		n.start();
		a.start();
		System.out.println(d.isAlive());
		d.join();
		n.join();
		a.join();
		System.out.println("resource closed");
		System.out.println("main ended");
		//d.run();//if we call manually,it will behave as single threaded programming
		//n.run();
		//a.run();

	}
	

}
