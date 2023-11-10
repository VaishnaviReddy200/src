package patternofname;

class Bathroom implements Runnable
{
	synchronized public void run()//only one thread is executed using synchronized
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" taking bath");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" excit from bathroom");
		}
		catch(Exception e)
		{
			System.out.println("Interrupated error");
		}
		
	}
}

public class MultipleThreades {

	public static void main(String[] args) 
	{
		Bathroom b=new Bathroom();
		
		Thread t=new Thread(b);
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		
		t.setName("girl");
		t1.setName("boy");
		t2.setName("brother");
		
		t.start();
		t1.start();
		t2.start();
		

	}

}
