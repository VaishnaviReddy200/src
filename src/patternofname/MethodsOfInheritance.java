package patternofname;
class Plane
{
	public void takeoff()//inherited method
	{
		System.out.println("Plane takeoff.....");
	}
	public void landing()
	{
		System.out.println("Plane landing....");
	}
}
class CargoPlane extends Plane
{
	public void landing()//overridden method
	{
		System.out.println("CargoPlane landing");
	}
	public void cargocarring()//specialized method
	{
		System.out.println("Cargocarring");
	}
}
class FlightPlane extends Plane
{
	public void landing()//overridden method
	{
		System.out.println("Flight landing");
	}
	public void weapons()//specialized method
	{
		System.out.println("weapons");
	}
}

public class MethodsOfInheritance {

	public static void main(String[] args) 
	{
		Plane c1=new CargoPlane();
		c1.takeoff();
		c1.landing();
		((CargoPlane)c1).cargocarring();//down casting(change behaviour of parent class to child)
		//FlightPlane f1=new FlightPlane();
		
		// TODO Auto-generated method stub

	}

}
