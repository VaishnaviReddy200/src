package patternofname;
class Phone
{
	public void call()
	{
		System.out.println("super class call");
	}
	public void call(int i)//method overloading-compile time polymorphism
	{
		System.out.println("call from int");
	}
}
class IPhone extends Phone
{
	public void call()//method overriding the method of sub class overrides the method of super class
	{
		super.call();//to call super call method
		System.out.println("sub class call");
	}
	
	
}
class PixcelPhone extends Phone
{
	public void call()
	{
		System.out.println("pixcel call");
	}
}

public class MethodOverriding {

	public static void main(String[] args) 
	{
		
		//Phone obj=new IPhone();//we create super class reference in subclass object
		//Phone obj=new PixcelPhone();//depends on which constructor is called-run time polymorphysim
		Phone obj=new Phone();
		//obj.call();//calls super class method
		obj.call(3);//it calls sub class method with same name called method overriding
		
		
	}

}
