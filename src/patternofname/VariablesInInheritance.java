package patternofname;
class A2
{
	int num=10;
}
class B2 extends A2
{
	int num=9;
	public void show()
		{
			int num=5;
			System.out.println(num);// preference to local variable 
			System.out.println(this.num);//current class  object
			System.out.println(super.num);//super keyword to refer parent class instance variables
		}
	}

public class VariablesInInheritance {

	public static void main(String[] args) 
	{
		B2 b2=new B2();
		b2.show();

	}

}
