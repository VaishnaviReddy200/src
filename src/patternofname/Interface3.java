package patternofname;
interface call
{
	//an empty interface is called marker interface//tagged interface
}
interface cal4
{
	float pi=3.14f;//final static float pi=3.14f;
	void add();
}
class calc
{
	void display()
	{
		System.out.println("display method");
	}
}
class MyCal3 extends calc implements cal4//first extends and implements both can be used
{
	public void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	
}
public class Interface3 
{

	public static void main(String[] args) 
	{
		MyCal3 c1=new MyCal3();
		c1.add();
		c1.display();
		

	}

}
