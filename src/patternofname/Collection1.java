package patternofname;

import java.util.*;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(20);
		a.add(5);
		a.add(30);
		
		
		Iterator i1=a.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			a.add(24);
		}
		
		
	}

}
