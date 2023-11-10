package patternofname;

import java.util.*;
import java.util.Collections;


class Employee12 
{
	 String name;
	 int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee12(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee12 [name=" + name + ", age=" + age + "]";
	}
	public Employee12(int age) {
		super();
		this.age = age;
	}
	
	
	
}
//class Alphaa implements Comparator<Employee12>//only one method it contains
//{
//	public int compare(Employee12 obj,Employee12 obj1)//it is traditional approch ,it sorts based on the reference  passed with in parameters which accept only two
//	{
//		if(obj.age>obj1.age)//comparator interface is not modified so to implement this no need to access this Employee class
//			return 1;
//		else
//			return -1;
//	}
//}
public class CollectionComplexSorting {

	public static void main(String[] args) 
	{
		Employee12 e=new Employee12("pravenn",8);
		System.out.println(e);
		Employee12 e1=new Employee12("vaishu",112);
		Employee12 e2=new Employee12("vaishu34",12);
		System.out.println(e1);
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e);
		a1.add(e2);
		//a1.add("vaishu");
		System.out.println(a1);
		//Alphaa a=new Alphaa();
		Comparator<Employee12> com=(Employee12 emp1,Employee12 emp2)->
		{
			if(emp1.age>emp2.age)
			   return 1;
			else
					return -1;
		};//using lambda expression(it does not have name and return type) we can use comparator even using ananymous class
		Collections.sort(a1,com);//automatically the compare method is called by the interface
		System.out.println(a1);
		
		

	}

}
