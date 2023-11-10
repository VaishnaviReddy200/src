package patternofname;
class Demo1
{
	static int a,b;//static variables get life at class loading time
	int x,y;//instance variables
	
	public static void main(String[] args)
	{
		
	}
	
	static //static block are invoke at class loading time
	{
		a=10;
		b=20;
		System.out.println("static block");
		System.out.println("a value "+ a);
	}
	
	{//jvm block initialization block or non static block
		x=30;
		y=40;
		System.out.println("x value "+ x);
		System.out.println("non static initilize method");
		
	}
	public void display1()//non static method
	{
		System.out.println("non static method");
	}
	static public void display()//static methods called by class name
	{
		
		System.out.println("Static block initilize method");
	}
	Demo1()//constructor
	{
		//{//jvm block initialization block or non static block//internal it automatically calls constructor initialization block
			//x=30;
			//y=40;
			//System.out.println("x value "+ x);
			//System.out.println("non static initialize method");
			
		//}
		System.out.println("this is a constructor");
	}
}

public class StaticAndNonStatic {

	public static void main(String[] args) 
	{
		Demo1.display();//object creation is not required for static method ,static method need to be invoked by class name or by reference also
		Demo1 d=new Demo1();
		d.display();

	}

}
