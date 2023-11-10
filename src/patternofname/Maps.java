package patternofname;
import java.util.Collection;
import java.util.*;
class M
{
	
}
public class Maps
{

	public static void main(String[] args)
	{
		HashMap h=new HashMap();//key value pair
		h.put(1,"virate");
		h.put(2,"virate1");
		h.put(3,"virate3");
		h.put(null, "hello");//null as key is allowed in hash map
		M m=new M();
		h.put(m,"hi");//key can be any type (it can be a reference also)
		System.out.println(h);
		Collection col=h.values();
		Iterator itr=col.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
//			String str1=(String) itr.next();
//			System.out.println(str1.toLowerCase());
		}
		Set col1=h.keySet();
		Iterator itr1=col1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&");
		Set set=h.entrySet();
		Iterator set1=set.iterator();
		while(set1.hasNext())
		{
			Map.Entry pair=(Map.Entry )set1.next();
			System.out.println(pair.getKey() +" *"+pair.getValue());
		}
		System.out.println("*******************************");
		LinkedHashMap h1=new LinkedHashMap();//key value pair
		h1.put(1,"virate");//output is in order of insertion
		h1.put(2,"virate1");
		h1.put(3,"virate3");
		h1.put(null, "hello");//null as key is allowed in hash map
		System.out.println(h1);
		
		TreeMap h2=new TreeMap();//key value pair
		h2.put(4,"virate");//output is in sorted of insertion
		h2.put(2,"virate1");
		h2.put(3,"virate3");
		//h2.put(null, "hello");//null as key is not  allowed in hash map
		System.out.println(h2);
		
		Hashtable h3=new Hashtable();
		h3.put(4, "m");
		h3.put(4,5);
		h3.put(1, 3);
		//h3.put(null, "l");null not allowed
		System.out.println(h3);
		
		

	}

}
