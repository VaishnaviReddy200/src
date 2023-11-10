package patternofname;
class Cal2
{
	int num1;//instance of variable
	int num2;//"""
	int res;//"""
	void add()//with out return and parameters
	{
		num1=10;//local variables and accessed with in this add() only
		num2=20;
		res=num1+num2;
		System.out.println(res);
	}
	void add(int a,int b)//with out return and with parameters 
	{
		num1=a;
		num2=b;
		res=num1+num2;
		System.out.println(res);
				
	}
	int add1(int a,int b)//both return and parameters//important and good partice
	{
		num1=a;
		num2=b;
	    //res= num1+num2;
		return num1+num2;
	}
	int add2() //no parameters but return value
	{
		num1=20;
		num2=90;
		return num1+num2;
	}
	
}

public class methodsinjava {

	public static void main(String[] args)
	{
		Cal2 c1=new Cal2();
		c1.add();
		c1.add(2,3);//calling a method and independent input(any input)
		int res=c1.add1(2,5);
		int res1=c1.add2();
		System.out.println(res);
		System.out.println(res1);
		
		

	}

}
