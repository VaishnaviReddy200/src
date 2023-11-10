package patternofname;
//final class HumanBeing//we can not inherit final class
class HumanBeing
{
	final void display()
	{
		System.out.println("humanbeing call");
	}
}
class Child extends HumanBeing
{
	//void display()
	{
		System.out.println("child call");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		Child h=new Child();
		h.display();
		
		// TODO Auto-generated method stub

	}

}
