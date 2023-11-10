package patternofname;
class A1 extends Object
{
	A1()
	{
		//super();//which is refer to parent class object behind the seen
		this(4);//constructor chaining
		System.out.println("constructor of A");
	}
	public void show() //method
	{
		System.out.println("show A");
	}
	A1(int num)
	{
		System.out.println("accept int A");
	}
}
class B1 extends A1//it does not extends Object class which leads to multiple inheritance
{
	 B1()
	{
		super();//refer to parent class behind the seen,so it will call class A1 
		
		System.out.println("constructor of B");
	}
	public void show()
	{
		super.show();
		System.out.println("show B");
	}
	B1(int num)//control will come here which accept 1 parameter
	{
		//super(num);//call to parent class with 0 parameter by default
		this();//current class constructor it will look for
		System.out.println("accept num b");
	}
}

public class ConstructorsInInheritance {

	public static void main(String[] args) 
	{
		B1 a1=new B1(5);
	    a1.show();//will call only one show() form class B1
	}

}
