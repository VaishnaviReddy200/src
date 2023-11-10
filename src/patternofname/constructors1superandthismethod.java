package patternofname;
class Dog7
{
	private int age;
	private int cost;
	private String name;
	Dog7(String name,int age,int cost)//Parameterized constructor
	{
		//super() for every constructor their will be a super method call by default,if and only if programmer as included this() but not both
		this.name=name;
		this.age=age;
		this.cost=cost;
	}
	Dog7()//constructor overloading with differ in number of parameters
	{
		//super()which refer to call parent class constructor
		this("lobo");//there is a call to another constructor with 1 parameter
		System.out.println("default constructor");
		
	}
	Dog7(String name)
	{
		this("yashi",7,1200);//call to another constructor with 3 parameters,this() and super() should be always first statement
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public int getCost() 
	{
		return cost;
	}
	public String getName() 
	{
		return name;
	}
}

public class constructors1superandthismethod {

	public static void main(String[] vaishu) //args is variable name we can give any name
	{
		Dog7 d2=new Dog7();//we are call a default constructor
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		System.out.println(d2.getName());
		main(10);//we need to call in main method
		main("string");
	}
	 static public void main(int a)//we can overload a main method also but jvm will starts execution from "string agrs[]"
	{
		System.out.println("interger value " + a);
	}
	 
	 
	public static void main(String a)
	{
		System.out.println("String value "+ a);
	}
}


