package patternofname;
import java.util.*;
class Rectangle
{
	float area;
	int length;
	int breath;
	
	
	
	void input()
	{
		System.out.println("enter the lenght and breath:");
		Scanner s=new Scanner(System.in);
		length=s.nextInt();
		breath=s.nextInt();
	}
	void compute()
	{
		area=length*breath;
	}
	void display()
	{
		System.out.println("the area of rectangle is:" + area);
	}
}
class Square
{
	float area;
	int length;
	
	void input()
	{
		System.out.println("enter the lenght :");
		Scanner s=new Scanner(System.in);
		length=s.nextInt();
	}
	
	void compute()
	{
		area=length*length;
	}
	void display()
	{
		System.out.println("the area of Square is:" + area);
	}
	
}	
class Circle
{
	double area;
	int radius;
	
	void input()
	{
		System.out.println("enter the radius :");
		Scanner s=new Scanner(System.in);
		radius=s.nextInt();
	}
	
	void compute()
	{
		area=radius*radius*3.14;
	}
	void display()
	{
		System.out.println("the area of circle is:" + area);
	}
}
	

	
	


public class Applicationwithoutopps {

	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Square s=new Square();
		
		r.input();
		r.compute();
		r.display();
		

		c.input();
		c.compute();
		c.display();
		
		

		s.input();
		s.compute();
		s.display();
		
		
		
		
		

	}

}
