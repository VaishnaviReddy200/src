package patternofname;

import java.io.File;
import java.io.PrintWriter;

public class FilePrintWriter {

	public static void main(String[] args) {
		try
		{

			File f=new File("C:\\Users\\MK\\Filehandling");
			
			File f1=new File(f,"telusko");
			
			PrintWriter p=new PrintWriter(f1);//advantage is we can work with all kind of data
			p.write(67);
			p.write("hello");
			p.println(45);
			p.println("java");
			p.println(45.5);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}

	}

}
