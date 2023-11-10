package patternofname;
class Demo0
{
	public static void display()
	{
		System.out.println("parent class");
	}
}
class Demo9 extends Demo0
{
	@Override// we can not over ride static method it will hide methods of parent class
	public static void display()//it will create a separate method for Demo9 class
	{
		System.out.println("child class");
	}
	
}

public class MethodHiding {

	public static void main(String[] args)
	{
		Demo9 d=new Demo9();
		d.display();

	}

}
