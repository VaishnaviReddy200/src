package patternofname;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
class telusko implements AutoCloseable
{
	public void close()
	{
		System.out.println("closed sussceffullu");
	}
}

public class File2 {

	public static void main(String[] args) {
		try(telusko t=new telusko())//try-resource java-7 closing resource
		{
			File f=new File("C:\\Users\\MK\\Filehandling");
			
			File f1=new File(f,"telusko");
			{
				System.out.println("hello opened successfully");
			}
			
//			FileWriter fw=new FileWriter(f1);//writing a file
//			fw.write("hello vaishu");
//			fw.write("\n");
//			fw.write(90);
//			
//			char ch[]= {'a','b','n','f','g'};
//			fw.write(ch);
//			fw.close();
			
			FileReader fr=new FileReader(f1);
//one way to read 			int i=fr.read();//read method will read char by char(from the hard disk)
//			while(i!=-1)//-1 means end of the character
//			{
//				System.out.print(i +"-->");
//				System.out.println((char)i);
//				i=fr.read();
//			}
			
			int size=(int)f1.length();
			char ch[]=new char[size];
			
			fr.read(ch);
			for(char c:ch)
			{
				System.out.print(c);
			}
			System.out.println();
			fr.close();
			
			
			System.out.println("go and check in floder");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Handling");
		}

	}

}
