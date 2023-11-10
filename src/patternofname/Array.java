package patternofname;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		int ar[]=new int[5];//array are treated as object
		
		//int a[]= {10,20,30,40};when data is known
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++)//length is a keyword which gives length of a array
		{
			System.out.println("please enter student "+ i +" marks");
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println( ar[i]);
			
		}


	}

}
