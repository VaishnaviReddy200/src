package patternofname;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Teacher implements Serializable//(marker interface)no need to implement jvm will provide implement at run time
{
	private String name;
	transient private int age;//which will not particate in serializable
	private String prof;
	
	
	public Teacher(String name, int age, String prof) {
		super();
		this.name = name;
		this.age = age;
		this.prof = prof;
	}
	 void display()
	{
		System.out.println("teacher name : "+name);
		System.out.println("teacher age : "+age);
		System.out.println("teacher proffican : "+prof);
	}


	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", prof=" + prof + "]";
	}
	
	
}
public class Serilable 
{

	public static void main(String[] args) 
	{
		try
		{
			Teacher t=new Teacher("ashoke",55,"teaching");
			t.display();//to achive persistance
			System.out.println(t.toString());
			FileOutputStream f=new FileOutputStream("C:\\Users\\MK\\Filehandling\\telusko");//seriliaztion,// storing the data in a file securely using streams (in form of bytes) , so that when this file is transferred over
			 //network , if hacked it cannot be understood.
			ObjectOutputStream o=new ObjectOutputStream(f);//to make entire object into stream we use object output
			o.writeObject(t);//to write object
			o.close();
			FileInputStream f2= new FileInputStream ("C:\\Users\\MK\\Filehandling\\telusko");//deseriliazation
			BufferedInputStream f1=new BufferedInputStream(f2);//fast
			ObjectInputStream o1=new ObjectInputStream(f1);
			Teacher  s=(Teacher )o1.readObject();
			s.display();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		
	}

}
