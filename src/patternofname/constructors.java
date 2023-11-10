package patternofname;

class Dog1
{
	private String name;//make private
	private int cost;
	private int age;
	
	Dog1(String name,int cost,int age)//constructor name should be same name as class name can replace setter method
	{
		this.name=name;
		this.cost=cost;
		this.age=age;
	}
	
	public String getName() {//this keyword is used is avoid naming conflict
		return name;//instead of all  setter methods we can make use of constructor and we can't replace getter method
	}
	//public void setName(String name) {
	//	this.name = name;
	//}
	public int getCost() {
		return cost;
	}
	//public void setCost(int cost) {
		//this.cost = cost;
	//}
	public int getAge() {
		return age;
	}
	//public void setAge(int age) {
		//this.age = age;
	//}
	

}

public class constructors {

	public static void main(String[] args)
	{
		Dog1 d1=new Dog1("vaishi",8,12000);//object is created for the constructor and also called when object is created can pass arguments
		//d1.name="tommy";//not good pratice to assign values it should be kept private
		//System.out.println(d1.name);//we need to create public getter and setter to set values
		//d1.setName("tommy");
		System.out.println(d1.getName());//no shortcut for getter method
		System.out.println(d1.getAge());
		System.out.println(d1.getCost());
		
	}

}
