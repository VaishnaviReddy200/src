package patternofname;
//run time polymorphism is achieved by overriding and creating parent type reference
class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	public void sleep()
	{
		System.out.println("Aminal is sleeping");
	}
}
class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tiger is eating");
	}
	public void sleep()
	{
		System.out.println("Tiger is sleeping");
	}
}
class Leo extends Animal
{
	public void eat()
	{
		super.eat();//to call super class method
		System.out.println("Leo is eating");
	}
	public void sleep()
	{
		System.out.println("Leo is sleeping");
	}
}
class Call6
{
	public void calling(Animal ref)//Animal is a object datatype//ploymorphism
	{
		
		ref.eat();
		ref.sleep();
	}
}
public class PolymorphismAndTypes {

	public static void main(String[] args) 
	{
		Leo l=new Leo();
		Tiger t=new Tiger();
		Animal a = new Animal();
		Call6 c1=new Call6();
		c1.calling(a);
		c1.calling(l);
		c1.calling(t);
		

	}

}
