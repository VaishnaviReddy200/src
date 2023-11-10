package patternofname;

import java.util.*;
import java.util.PriorityQueue;

public class CollectionArrayDeque {

	public static void main(String[] args)
	{
		ArrayDeque d=new ArrayDeque();
		d.add(100);
		d.add(200);
		d.add(100);
		d.add("string");
		d.addFirst(2);
		System.out.println(d);
		System.out.println("****************************************");
		PriorityQueue p=new PriorityQueue();
		p.add(20);
		p.add(20);
		p.add(30);
		p.add(50);
		p.add(90);
		p.add(45);
		p.add(10);
		p.add(100);
		System.out.println(p);
		System.out.println("****************************************");
		TreeSet set=new TreeSet();
		//set.add(10);
		set.add(5);
		set.add(200);
		//set.add(10);
		set.add(90);
		set.add(40);
		set.add(150);
		set.add(105);
		set.add(108);
		System.out.println(set);//binary search

		System.out.println(set.ceiling(90));//it will search for 10 its present it will return same value else it will return higher object
		System.out.println(set.higher(90));//it will search and return higher object than 75
		System.out.println(set.floor(10));
		
		

	}

}
