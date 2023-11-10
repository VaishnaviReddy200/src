package patternofname;
import java.util.*;
public class Collection {

	public static void main(String[] args)
	{
		List l=new ArrayList();
		
		l.add(10);//l is object
		l.add(400);
		l.add(-900);
		l.add(100);
		
		//System.out.println(l);
		
//		Object obj=l.get(2);//object type parent type reference
//		System.out.println(obj);
//		Integer i1=(Integer)l.get(3);//down casting
//		System.out.println(i1);
//		System.out.println("333333333333333333333");
		//for(int i=0;i<l.size();i++)
		//{
//			Object obj1=l.get(i);
//			System.out.println(obj1);
//		}
//		for(Object l1:l)
//			
//		{
//			System.out.println(l1);
//		}
		Iterator t=l.iterator();//to fetch the values from the arrayList
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		System.out.println("11111111111111111111");
		ListIterator t1=l.listIterator(l.size());
		while(t1.hasPrevious())
		{
			System.out.println(t1.previous());
		}
		System.out.println("************************");
		
		ArrayList l1=new ArrayList();
		
		l1.add("vaishu");
		l1.add(10);
		l1.add(10.0);
		l1.add("&");
		
		System.out.println(l1);
		l1.add(0,10);
		System.out.println(l1);
		l1.add(1, l);
		System.out.println(l1.contains(10));

		System.out.println(l1);
		
		

	}

}
