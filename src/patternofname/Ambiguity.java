package patternofname;
class A
{
	public void show() 
	{
	System.out.println("class A");
	}
}
class B
{
	public void show()
	{
		System.out.println("class B");
	}
}
class C extends A,B//it has a ambiguity problem in multiple inheritance,which show() to be called is not known so this concept is not supported by java
{

}

public class Ambiguity {

	public static void main(String[] args) {
		C c1=new C();
		c1.show();

		

	}

}
