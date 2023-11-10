package patternofname;
import java.util.*;

class Farmer
{
	float pa;
	float ti;
	static float ri;
	 float si;
	
	static
	{
		ri=2;
	}
	
	public void input()
	{
		System.out.println("Farmer applicaton");
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the pricipal amount and time requried");
		pa=scan.nextFloat();
		ti=scan.nextFloat();
		
				
		
	}
	public void compute()
	{
		si=pa*ti*ri/100;
	}
	public void display()
	{
		System.out.println("the simple interest is "+ si);
	}
}

public class ApplicationOfStatic {

	public static void main(String[] args)
	
	{
		Farmer f=new Farmer();
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		f.input();
		f.compute();
		f.display();
		
		f1.input();
		f1.compute();
		f1.display();
		
		f2.input();
		f2.compute();
		f2.display();
	}
	
	}


