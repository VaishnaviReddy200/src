package patternofname;
import java.util.Scanner;
interface cal//how to define interface
 {
	 void add();//public abstract void add behind seen interface methods are public and abstract
	 void sub();
	 
 class MyCal implements cal//for abstract keyword is used for abstract methods 
{
	public void add()//we can not change the visibility to over ride methods 
	{
		int a=20;
		int b=90;
		int res=a+b;
		System.out.println(res);
	}
	public void  sub()
	{
		int b=20;
		int a=90;
		int res=a-b;
		System.out.println(res);
	}
}
 class My implements cal
{
	public void  add()//different body for same interface methods 
	{
		//int res=a+b;
		//System.out.println(res);
		//Scanner scan=new Scanner(System.in);
		//System.out.println("please enter a num1");
		//int a=scan.nextInt();
		//System.out.println("please enter a num2");
		//int b=scan.nextInt();
		//int res=a+b;
		//System.out.println(res);
		
	}
	public void sub()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a num1");
		int a=scan.nextInt();
		System.out.println("please enter a num2");
		int b=scan.nextInt();
		int res=a-b;
		System.out.println(res);
		
	}
}
public class Interface {

	public static void main(String[] args) 
	{
		cal c1=new MyCal();//we create parent reference also
		c1.add();
		c1.sub();
		cal c2=new My();//we create parent reference also
		//c2.add(2,4);
		c2.sub();
	}

}
