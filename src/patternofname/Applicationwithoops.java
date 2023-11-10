package patternofname;
import java.util.*;
abstract class Shapes
{
	float area;
	abstract void input();
	abstract void compute();
	
	public void display()
	{
		System.out.println("The are is:" + area);
	}
	
}
class Rectangle1 extends Shapes
{
	int length;
	int breath;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length and breath of a rectsngle");
		length=s.nextInt();
		breath=s.nextInt();
	}
	void compute()
	{
		area=length*breath;
	}
}
class Circle1 extends Shapes
{
	float radius;
	final float pi=3.14f;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius");
		radius=s.nextInt();
	}
	void compute()
	{
		area=pi*radius*radius;
	}
}
class Square1 extends Shapes
{
	int length;
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length");
		length=s.nextInt();
	}
	void compute()
	{
		area=length*length;
	}
}
class Compute 
{
	public void permit(Shapes ref)
	{
		ref.input();
		ref.compute();
		ref.display();
	}
}
	
	
	
	


public class Applicationwithoops {

	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Square s=new Square();
		
		Compute c1=new Compute();
		c1.permit(r);
		c1.permit(s);
		c1.permit(c);
		
		
		
		
		

		

	}

}
