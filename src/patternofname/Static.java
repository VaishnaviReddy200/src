package patternofname;
class Demo5
{
	int a,b;
	static int count;//only one copy of reference is created for all object
	
	{//block intailization invoked automatically in are three constructor
		count++;
	}
	
	public Demo5()
	{
		
	}
	public Demo5(int a)
	{
		
	}
	public Demo5(int a,int b)
	{
		
	}
}

public class Static {

	public static void main(String[] args)
	{
		Demo5 d=new Demo5();
		//System.out.println(d.count);
		
		Demo5 d1=new Demo5();
		//System.out.println(d1.count);
		
		Demo5 d2=new Demo5();
		System.out.println(d2.count);


	}

}
