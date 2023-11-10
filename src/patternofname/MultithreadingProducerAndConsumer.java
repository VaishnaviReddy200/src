package patternofname;
class Producer extends Thread
{
	Communicate1 c;
	public Producer(Communicate1 y)
	{
		c=y;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			
			c.put(i++);
		}
		
	}
}
class Consumer extends Thread

{
	Communicate1 c1;//loosing coupling ,c1 is the variable name of Communicate type of data
	
	public Consumer(Communicate1 y)
	{
		c1=y;
	}
	
	public void run()
	{
		while(true)
		{
			c1.get();
		}
		
	}
}
class Communicate1 
{
	int x;
	boolean flag=false;
	
    synchronized public void put(int data)
	{
    	try
    	{
    		if(flag==true)
    		{
    			wait();
        		
    		}
    		else
    		{
    			x=data;
        		System.out.println("the data is produced  "+x);
        		flag=true;
        		notify();
    		}
    		
    	}
		catch(Exception e)
    	{
			System.out.println("Exception handled");
    	}
	}
	synchronized public void get()
	{
	try
	{
		if (flag==false)
		{
			wait();
			
		}
		else
		{

			{
				System.out.println("the data is consummed  "+x);
			}
			flag=false;
			notify();
		}
		
	}
	
	catch(Exception e)
	{
		System.out.println("Exception is caught");
	}
}
}
	

public class MultithreadingProducerAndConsumer {

	public static void main(String[] args)
	{
		Communicate1 co=new Communicate1();
		
		Producer p=new Producer(co);
		
		Consumer c=new Consumer(co);
		
		p.start();
		c.start();

	}

}
