package patternofname;

public class purchase
{
	private Course c;//Course c=new Python(), 
	
	public purchase(Course c)//constructor Injection
	{
		this.c=c;
	}
	public void setpurchase(Course c)//setter injection
	{
		this.c=c;
	}

	public boolean buy(int a)
	{
//		Java j=new Java();
//		j.purchased();
	    boolean status=c.purchased();
		return status;
	}
}

