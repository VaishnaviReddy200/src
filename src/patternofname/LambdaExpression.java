//interface are 3types

//1.normal
//2.SAM-single abstract interface or functional interface
//3.marker interface with 0 methods
package patternofname;
interface Calcs
{
	void show();
}
//class CalcsImp implements Calcs
//{
//	public void show()
//	{
//		System.out.println("in show");
//	}
//}

public class LambdaExpression {

	public static void main(String[] args) 
	{
		//CalcsImp c=new CalcsImp()
		//c.show();
		//Calcs c=new Calcs()//anaymous class
		//		{
			//     public void show()
			  //   {
			    //	 System.out.println("show 2");
			     //}
			
				//};
				//c.show();
		Calcs c=() -> System.out.println("show3");//lambda expression,will work in only one method and functional interface has only one method
		
		c.show();
		

	}

}
