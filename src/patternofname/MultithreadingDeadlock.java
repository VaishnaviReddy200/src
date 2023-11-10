package patternofname;
class Library implements Runnable
{
	String res1=new String("JAVA");
	String res2=new String("DSA");
	String res3=new String("JAVA(OOP)");
	
	public void run()
	{
		String tname=Thread.currentThread().getName();
		if("Student1".equals(tname))
		{
			try
			{
				Thread.sleep(5000);
				synchronized(res1)//lock to resource
				{
					System.out.println("Student1 has acquired " +res1);
					Thread.sleep(5000);
				
				synchronized(res2)
				{
					System.out.println("Student1 has acquired " +res2);
					Thread.sleep(5000);
				
				synchronized (res3)
				{
					System.out.println("Student1 has acquired " +res3);
				}
				}
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
		}
		else
		{
			try
			{
				Thread.sleep(5000);
				synchronized(res1)
				{
					System.out.println("Student2 has acquired " +res1);
					Thread.sleep(5000);
				
				synchronized(res2)
			{
					System.out.println("Student2 has acquired " +res2);
					Thread.sleep(5000);
			
				synchronized (res3)
				{
					System.out.println("Student2 has acquired " +res3);
				}
			}
			
			}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
			
		}
	}
	
}

public class MultithreadingDeadlock {

	public static void main(String[] args) 
	{
		Library lib=new Library();
		Thread t=new Thread(lib);
		Thread t1=new Thread(lib);
		t.setName("Student1");
		t1.setName("Student2");
		t.start();
		t1.start();
		
		

	}

}
