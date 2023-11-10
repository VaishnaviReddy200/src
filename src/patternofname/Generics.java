package patternofname;

import java.util.*;
import java.util.Collection;
class Vaishu
{
	
}
class Learner extends Vaishu
{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "learner [age=" + age + ", name=" + name + "]";
	}
	public Learner(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}

public class Generics {

	public static void main(String[] args) {
		String st[]=new String[3];//when type of data is known it is good to use array not collection(1.2),type saftey
		st[0]="Praveen";
		st[0]="Praveen1";
		String str=st[0];
		System.out.println(str.toLowerCase());
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("String");
		l.add("String1");
		//l.add(10);//no type saftey due to this draw back generic came into picture in java 1.5
		
		//String st1=(String)l.get(1);
		String st1=l.get(0);//no need to type cast
		System.out.println(st1.toUpperCase());
		
		Learner lean=new Learner(10,"vaishu");
		Learner lean1=new Learner(16,"vaishu1");
		//ArrayList <Learner>l2=new ArrayList();//only object type of data is stored,primitive type of data is not stored in generic
		//List <Learner>l2=new ArrayList();//we can have parent type of reference for child
		Collection <Learner>l2=new ArrayList<>();//grant parent reference no effect in generic,in right side it can't be child type generic
		l2.add(lean1);
		l2.add(lean);
		//l2.add(10);
		
		System.out.println(l2);

	}

}
