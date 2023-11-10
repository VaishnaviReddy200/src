package patternofname;

import java.util.Arrays;

public class Array2 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,30,40};
		
		//for(int i=0;i<arr.length;i++)//instead of this for loop we can use for each loop or enhanced loop or advanced loop from java 5
		//{
			//System.out.println(arr[i]);
		//}
		for (int ele:arr)//ele is the variable name to store the values of array of interger data type
		{
			System.out.println(ele);
		}
		System.out.println(arr.getClass().getName());//class for single array
		
		
		int a[][]= {{1,2,3},{4,5,6}};
		
		for (int a1[]:a)//a1[] is another array which stores a values
		{
			for (int ele:a1)
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		System.out.println(a.getClass().getName());//even array as a class created by its own
		
		int b[]= {1,2,3,4,0};
		
		System.out.println("before printing");
		for (int ele:b)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		Arrays.sort(b);
		System.out.println("after printing");
		for (int ele:b)
		{
			System.out.print(ele+" ");
		}
		

	}

}
