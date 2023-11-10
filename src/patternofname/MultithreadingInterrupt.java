package patternofname;

class Example implements Runnable
{
	public void run()
	{
		try
		{
		for (int i=0;i<5;i++)
		{
			System.out.println("focus is the key " +i);
			Thread.sleep(5000);
		}
		}
		catch(Exception e)
		{
			System.out.println("Interrupated error");
		}
	}
}
public class MultithreadingInterrupt {

	public static void main(String[] args)
	{
		Example e=new Example();
		Thread t=new Thread(e);
		t.start();
		t.interrupt();//thread can be interrupted only when it is in sleep,wait,block state
		
	}

}
