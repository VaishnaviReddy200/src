package patternofname;

public class Multithreadeing1 {

	public static void main(String[] args)throws Exception
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
		
		System.out.println("************************************");
		
		System.out.println("Activity 2 started");
		for (int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		Thread.sleep(5000);
		System.out.println("Activity 2 ended");
		
		System.out.println("**************************************");
		
		System.out.println("Activity 3 started");
		for(int i=65;i<70;i++)
		{
			System.out.println((char)i);
		}
		System.out.println("Activity 3 ended");

	}


	}


