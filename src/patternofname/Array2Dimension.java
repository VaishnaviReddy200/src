package patternofname;
import java.util.*;

public class Array2Dimension {

	public static void main(String[] args) 
	{
	//int [][]arr=new int[3][5];
	//int arr[][]= {{},{}};we can assign values to 2-D array
	int [][]arr=new int[3][];//2D jagged array
	arr[0]=new int[4];
	arr[1]=new int[5];
	arr[2]=new int[2];
	
	int arr1[]= {2,4,5};//valid
	
	int arr2[]=new int[] {1,2,3};//valid
	
	char c[]=new char[4];//to store character
	
	char c1[]= {'a','d','f','r'};//valid
	
	String st[]= {"navin","hydre","abbas"};
	
	String []s=new String[4];//valid
	
	String st1[]= new String[]{"navin","hydre","abbas"};//valid
	
	
	
	
	
	Scanner s1=new Scanner(System.in);
	for (int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
            System.out.println("the class name is "+ i + " marks of student " + j);
            arr[i][j]=s1.nextInt();
		}
	}
	System.out.println("marks of students are");
	for (int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
            System.out.print(arr[i][j]+" ");
            
		}
		System.out.println();
	}
	
	
	

	}

}
