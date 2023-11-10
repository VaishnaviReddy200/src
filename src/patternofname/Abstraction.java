package patternofname;

abstract class Plane3
{
	abstract public void takeoff();//it with out body their can be a method signature this abstract keyword,if one method is also abstract then class should be also abstract class
	
	abstract public void landing();
	
	public Plane3()
	{
		System.out.println("conatructor call");
	}
	
	public void parent()
	{
		System.out.println("parent class call");
	}
}
class CargoPlane3 extends Plane3//if we won't give implementation in child class then we need to declare it also as abstract class
{
	public void landing()//overridden method
	{
		System.out.println("CargoPlane landing");
	}
	public void takeoff()//it is mandatory to have implementation of all  abstract methods of abstract class
	{
		System.out.println("Cargocarring");
	}
}
class FlightPlane3 extends Plane3
{
	public void landing()//overridden method
	{
		System.out.println("Flight landing");
	}
	public void takeoff()//specialized method
	{
		System.out.println("weapons");
	}
	
}
public class Abstraction {

	public static void main(String[] args) 
	{
		
		CargoPlane3 c1=new CargoPlane3();
		c1.landing();

	}

}
