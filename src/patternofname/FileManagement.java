package patternofname;

import java.io.File;

public class FileManagement 
{

	public static void main(String[] args) 
	{
		String f2="C:\\Users\\MK\\Filehandling\\telusko.txt";
		try
		{
			File f=new File(f2);//f is referring to to telusko.text file
			f.createNewFile();
			
			System.out.println(f.exists());
			System.out.println(f.getPath());
			
			File dir=new File("C:\\Users\\MK\\Filehandling\\Vaishu");
			System.out.println(dir.exists());
			dir.mkdir();//make directory
			System.out.println(dir.exists());
			System.out.println(dir.isDirectory());
			
			File f3=new File("C:\\Users\\MK\\eclipse-workspace\\patternofname\\src\\patternofname");
			String str[]=f3.list();
			
			int count=0;
			for(String s:str)
			{
				count++;
				System.out.println(s);
			}
			System.out.println(count);
		}
		catch(Exception e)
		{
			System.out.println("Some exception at run time");
		}
		
	}

}
