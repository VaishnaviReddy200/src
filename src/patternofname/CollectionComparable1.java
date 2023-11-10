package patternofname;
import java.util.*;
class Employee10 implements Comparable<Employee10>
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
	public Employee10(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee12 [name=" + name + ", age=" + age + "]";
	}
	public Employee10(int age) {
		super();
		this.age = age;
	}
	@Override
	public  int compareTo(Employee10 ref)//only one reference is used with a class interface
	{
		if(this.age>ref.age)
			return 1;
		else
			return -1;
					
	}
	
	
}

public class CollectionComparable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee10 e=new Employee10("pravenn",8);
		System.out.println(e);
		Employee10 e1=new Employee10("vaishu",112);
		Employee10 e2=new Employee10("vaishu34",12);
		//System.out.println(e1);
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e);
		a1.add(e2);
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);

	}

}
