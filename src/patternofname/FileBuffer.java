package patternofname;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class FileBuffer {

	public static void main(String[] args) 
	{
		try
		{
			File f=new File("C:\\Users\\MK\\Filehandling");
			
			File f1=new File(f,"telusko");
//			FileWriter fw=new FileWriter(f1);
//			BufferedWriter fb=new BufferedWriter(fw);
//			fb.write("hello yashu");
//			fb.write(78);
//			fb.newLine();
		    FileReader fr=new FileReader(f1);
		    BufferedReader bf=new BufferedReader(fr);
		    String data=bf.readLine();
		    while(data!=null)
		    {
		    	System.out.println(data);
		    	data=bf.readLine();
		    }
		    bf.close();
		    fr.close();
			//if we use this no need to use close method
			System.out.println("check in PC");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		

	}

}
