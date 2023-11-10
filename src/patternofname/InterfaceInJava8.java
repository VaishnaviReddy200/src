package patternofname;
interface Demo
{
	void drawing();
	default void display()
	{
		System.out.println("interface methods by using default keyword");//we can give implementation for interface also in java 8 by using default keyword
	}
	public static void staticmethod()
	{
		System.out.println("Static method");
	}
}
class Drawing implements Demo
{
	public void drawing()
	{
		System.out.println("overriden method of interface method");
	}
	public void display()//it is optional to override a default method in java8
	{
		System.out.println("overridden method by default method");
	}
	public static void staticmethod()
	{
		System.out.println("override static method");
	}
}
public class InterfaceInJava8 {

	public static void main(String[] args) 
	{
		Drawing d1=new Drawing();
		d1.drawing();
		d1.display();
		Demo.staticmethod();
		d1.staticmethod();
		

	}

}
