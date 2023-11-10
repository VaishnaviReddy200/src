package patternofname;
class A4
{
	//B4 obj=new B4();
	public void show()
	{
		System.out.println("show A");
		//obj.show();
	}
	
	//class B4//it is called as member inner class
	//{
		//public void show()
		//{
			//System.out.println("Show B");
		//}
	static class B4//it is called static inner class
	{
		public void show()
		{
			System.out.println("static b show");
	}
	
	}
}

public class InnerClasss {

	public static void main(String[] args)
	{
		A4 obj=new A4();//anonymous inner class
		obj.show();
	//	{
			//@Override
		//	public void show()
		//	{
		//		super.show();
			//	System.out.println("Ananymous class");	
		//	}	
		//};
		//obj.show();
		
		//A4.B4 obj1=obj.new B4();//to create the object of inner class we need to create outer class object
	    //obj1.show();
		A4.B4 obj1=new A4.B4();
		obj1.show();	
	}
}
