package patternofname;
interface calc1
{
	void add();
	void sub();
}
interface calc2 extends calc1//one interface can extend another interface but can not implement anther interface
{
	void mul();
	void div();
}
class calc3 implements calc1,calc2//multiple  inheritance is possible
{
	public void add()
	{
		int a=10;
		int b=5;
		int res=a+b;
		System.out.println(res);
				
	}
	public void sub()
	{
		int a=10;
		int b=5;
		int res=a-b;
		System.out.println(res);
				
	}
	public void mul()
	{
		int a=10;
		int b=5;
		int res=a*b;
		System.out.println(res);
				
	}
	public void div()
	{
		int a=10;
		int b=5;
		int res=a/b;
		System.out.println(res);
				
	}
	
}
public class Interface1 {

	public static void main(String[] args)
	{
		calc3 c3=new calc3();
		c3.add();
		c3.sub();
		c3.mul();
		c3.div();

	}

}
