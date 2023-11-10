package patternofname;
import java.util.*;

public class Exception1 {

	public static void main(String[] args) 
	{
		System.out.println("connection started succesfully");
		Scanner s=new Scanner(System.in);
		try
		{
		
		
		System.out.println("plese enter an numerator");
		int num=s.nextInt();
		System.out.println("please enter an denomerator");
		int den=s.nextInt();
		
		int res=num/den;
		
		System.out.println("the result is : " +res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("please enter a non zero values");
		}
		try
		{
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		int []ar=new int[size];
		System.out.println("enter the element to be inserted");
		int ele=s.nextInt();
		System.out.println("enter the poistion to insert the values");
		int pos=s.nextInt();
		ar[pos]=ele;
		System.out.println("the array is " + ar[pos]);
		
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("enter only positive numbers");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter with in range of array");
		}
		catch(Exception e)
		{
			System.out.println("enter valid input");
		}
		
		System.out.println("connection terminated succesfully");
		
		

	}

}
