package patternofname;
interface Square5
{
	//int area(int a);
	int add(int num1,int num2);
}


public class LambdaExpression2 
{

	public static void main(String[] args) 
	{
//		Square5 s=new Square5() 
//		{
//			public int area(int a)
//			{
//				return a*a;
//			}
//		};
		//System.out.println(s.area(4));
		Square5 s=(num1,num2)-> num1+num2;//lambda expression,no need of datatype
		System.out.println(s.add(4,5));
	}

}
