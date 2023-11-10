package patternofname;

public class Main //extends Java inheritance
{

	public static void main(String[] args)
	{
//		Java j=new Java();
//		j.purchased();//composition in java tight coupling
		purchase p=new purchase(new Java());//constructor injection
		
		p.setpurchase(new Spring());//setter injection
		boolean staus=p.buy(0);
		if (staus)
		{
			System.out.println("purchase succefully");
		}
		else
		{
			System.out.println("not purchased");
		}
	
	}

}
