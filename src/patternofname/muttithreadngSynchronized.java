package patternofname;

class Care implements Runnable
{
	 public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered parking lot");
			Thread.sleep(4000);
			synchronized(this)
			{
			System.out.println(Thread.currentThread().getName()+" started driving");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" car came back to park place");
			}
		}
		catch(Exception e)//e is the reference of exception
		{
			System.out.println("Interrupated error");
		}
	}
}
public class muttithreadngSynchronized {

	public static void main(String[] args) 
	{
		Care c=new Care();
	

		Thread t=new Thread(c);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		
		t.setName("child");
		t1.setName("child1");
		t2.setName("child2");
		
		
		t.start();
		t1.start();
		t2.start();
		


	}

}
