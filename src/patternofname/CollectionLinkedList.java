package patternofname;
import java.util.*;
public class CollectionLinkedList {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add("String");
		l.add(20);
		l.add("yashi");
		System.out.println(l);
		l.add(2,300);
		l.addFirst(900);
		l.addLast(600);
		System.out.println(l);
		
		System.out.println("*****************************");
		
		LinkedList l1=new LinkedList();
		l1.add(100);
		l1.add("String");
		l1.add(20);
		l1.add("yashi");
		System.out.println(l1);
		System.out.println(l1.peekFirst());//this method will fetch the first element with out distorting the array list
		System.out.println(l1.pollFirst());//will delete the first element with distorting the array list
		System.out.println(l1);
		l1.add(100);//it will add to the list
		System.out.println(l1);
		l1.offer(300);//it may or not add to the list
		System.out.println(l1);
		
		

	}

}
