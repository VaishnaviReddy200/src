package patternofname;
class Employee
{
	String name;
	int age;
	int salary;
	public  Employee()
	{
		name="vaishu";
		age=22;
		salary=20000;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	@Override
	public String toString()
	{
		return   name;
	}
}

public class ObjectClass {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		//e1.employee();
		System.out.println(e1);

	}

}
