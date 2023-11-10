package patternofname;
class WordPad implements Runnable
{
	public void run()
	{
		String tname=Thread.currentThread().getName();
			if("type".equals(tname))
			{
				typing();
			}
			else if("spell".equals(tname))
			{
				spellcheck();
			}
			else
			{
				save();
			}
		
			
	}
		
	
	public void typing()
	{
		try
		{
		for(int i=0;i<3 ;i++)
		{
		System.out.println("typing");
		Thread.sleep(5000);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	
	public void spellcheck()
	{
		try
		{
		for(int i=0;i<3 ;i++)
		{
		System.out.println("checking spelling");
		Thread.sleep(5000);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	public void save()
	{
		try
		{
		for(int i=0;i<3 ;i++ )
		{
		System.out.println("saving");
		Thread.sleep(5000);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
}

public class MultithreadingDaemonthread {

	public static void main(String[] args) 
	{
		WordPad wp=new WordPad();
		
		Thread t=new Thread(wp);
		Thread t1=new Thread(wp);
		Thread t2=new Thread(wp);
		
		t.setName("type");
		t1.setName("spell");
		t2.setName("save");
		
		//t1.setDaemon(true);//daeman thread exectues to be atleast make two lines to execute at end,after other threads doing work u have to do work
		t2.setDaemon(true);
		
//		t1.setPriority(3);
	t2.setPriority(4);//when ever daemen is used we need to set priority
		
		t.start();
		t1.start();
		t2.start();
	}

}
