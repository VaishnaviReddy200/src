package patternofname;

import java.util.*;

class Student1 extends Thread
{
	int rollno;
	String name;
	@Override
	public String toString()
	{
		return "Student " + name +" ,"+" Rollno " +rollno;
	}
	@Override
	public void finalize()//it is a method of garbage collector,in this finalize method to clean code is written,which is automatically called by gc()
	{
		System.out.println("clean object");//it act like a deaman thread
	}
}
public class MapWeakHashMap {

	public static void main(String[] args)throws Exception
	{
		Student1 s=new Student1();
		HashMap h=new HashMap();//hash map dominate garbage collector
		//WeakHashMap h=new WeakHashMap();//gc is called it does not dominate
		h.put(s,1);
		System.out.println(h);
		s=null;//reference less object
		System.gc();//,calling garbage collector
		Thread.sleep(5000);
		System.out.println(h);
		System.out.println("Last line");
	}

}
