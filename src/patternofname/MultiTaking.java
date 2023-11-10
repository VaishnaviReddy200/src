package patternofname;
class Multitasker implements Runnable
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		if (name.equals("doller"))
		{
			this.doller();
		}
		else if (name.equals("number"))
		{
			this.Number();
		}
		else
		{
			this.Alpha();
		}
	}
	public void doller()
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
	public void Number()
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
	public void Alpha()
	{
		{
			System.out.println("Activity 3 started");
			for(int i=65;i<70;i++)
			{
				System.out.println((char)i);
			}
			System.out.println("Activity 3 ended");

		}
	}
}


public class MultiTaking {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multitasker m=new Multitasker();
		
		Thread t=new Thread(m);
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		
		t.setName("dollar");
		t1.setName("number");
		t2.setName("Alpha");
		
		t.start();
		t1.start();
		t2.start();
		

	}

}
