package patternofname;

import java.util.*;
import java.util.Arrays;
import java.util.*;
import java.util.function.Consumer;

public class Maps2 {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(20);
		a.add(400);
		a.add(60);
		System.out.println(a);
		
		List<Integer> l=Arrays.asList(-1,-3,0,-3);
		System.out.println(l);
		
//		for(Object obj:a)//for each
//		{
//			System.out.println(obj);
//		}
//		Consumer con=new Consumer()//anaymous class
//				{
//			@Override
//			public void accept(Object obj)
//			{
//				System.out.println(obj);
//			}
//			
//				};
		Consumer<Integer> con=n->System.out.println(n);//lambda expression
		
		//l.forEach(n->System.out.println(n));

	}

}
