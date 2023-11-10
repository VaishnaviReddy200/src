package patternofname;
 class Car5
{
	 void display()//to override this method we need to create child car5 extends the method and then override
	{
		System.out.println("display car class");
	}

}
// class Car3 extends Car5//only purpose of this class to override the method,we are wasting memory in term of class file,u can do this by anoymous inner class
// {
//	 void display()
//	 {
//		 System.out.println("child class care");
//	 }
// }

public class AnanymousClass {

	public static void main(String[] args) 
	{
		Car5 c=new Car5()//subclass of CAR5 from new,and we can implement a abstract methods and create a object and call them
		{
			public void display()//we can change the behaviour of a class by creating anoymous inner class,with $ a .class file is created,there will be no name for this classes
			
			{
				super.display();
				System.out.println("display anaymous car");
			}	
			public void show()
			{
				System.out.println("hello");
			}
			
			
		};
		c.display();
		//c.show();error because it can not access specialized methods of anoymous inner class
		Car5 c1=new Car5();//error we can not reuse anonymous inner class,when only once a class is used then use anymous inner class
		c1.display();
	}

}
