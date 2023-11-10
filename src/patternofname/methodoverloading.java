package patternofname;
class Method
{
	//int add(int n1,int n2)//differ in number of parameters or method name called as method overloading 
	//{
	//	return n1+n2;
	//}
	int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	double add(double n1,double n2)
	{
		return  n1+n2;
	}
}

public class methodoverloading {

	public static void main(String[] args) {
		Method m1=new Method();//object is created to the class
		int res=m1.add(1,4,3);
		double res1=m1.add(2,6);
		System.out.println(res);
		System.out.println(res1);
		
	}

}
