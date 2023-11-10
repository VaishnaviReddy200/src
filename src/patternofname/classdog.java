package patternofname;
class Dog
{
	String name;//instance variable
	int cost;
	
	void sleep() 
	{
		System.out.println("sleeping");
		
	}
	void eat()//methods or activity
	{
		System.out.println("eating");
	}
}

public class classdog {

	public static void main(String[] args) 
	{
		Dog d=new Dog();//local reference variable
		d.sleep();//d is the reference variable of a object created of a class
		d.eat();
		d.name="vaishu";
		System.out.println(d.name);
		Dog d1=new Dog();//object is created or instance of a class
		d.sleep();//to call a method in the class
		d1.eat();//we can create any number of objects for a single class
				
		

	}

}
