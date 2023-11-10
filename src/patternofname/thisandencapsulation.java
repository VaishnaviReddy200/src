package patternofname;
//this concept of bending methods and variables is called encapsulation
class Alien
{
	private int age=22;
	private String name="vaishu";//it is not good to assign values in instance variables
	private String bestlan="java";
	public int getage()//to get a value getter method
	{
		return age;
		
	}
	public void setbestlan(String bestlan)//to set a value setter method
	{
		//Alien obj=new Alien();//it will create a new object and change the value for new object not the instance variable
		//obj.bestlan=bestlan;//to make this work use a built in "this" key word,which refer to instance variables//output is "java"
		this.bestlan=bestlan;//using this keyword refer to current object
		//System.out.println(obj.getbestlan());
		
	}
	public String getbestlan()//for each variable we need to create 2 methods get and set
	{
		return bestlan;
	}
}

public class thisandencapsulation {

	public static void main(String[] args) {
		Alien a1=new Alien();
		//System.out.println(a1.age);//we can access private variables only way is to create public get methods and public set methods
		System.out.println(a1.getage());
		//System.out.println(a1.setbestlan());
		a1.setbestlan("vision");
		System.out.println(a1.getbestlan());
		

	}

}
