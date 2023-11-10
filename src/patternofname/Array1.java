package patternofname;
class Animal5
{
	String name;
	int age;
}
class monkey
{
	int cost;
}

public class Array1 
{

	public static void main(String[] args)
	{
		//Animal5 []a=new Animal5[3];//array for animal type of data is created
		Object a[]=new Object[3];
		a[0]=new Animal5();//we create any number of objects for class
		a[1]=new Animal5();//a is object
		//a[2]=new Animal5();
		a[2]=new monkey();
		//System.out.println(a[0].name="dog");
	}

}
