package patternofname;

import java.util.ArrayList;
import java.util.List;

class Home
{
	public void sweet()
	{
		System.out.println("sweet home!!");
	}
}
class Hut extends Home
{
	public void sweet()
	{
		System.out.println("sweet hut!!");
	}
}
class Run extends Home
{
	
}

public class GenericWildCard 
{

	private static final Home[] list = null;
	public static void main(String[] args) 
	{
		Object obj=new Object();
		String str="name";
		obj=str;//achived by polymorphism,parent can hold child object
		
		//h1.add(12);//error
		Home h=new Home();
		
		Hut h2=new Hut();
		
		h=h2;
		
//		ArrayList<Home> h1=new ArrayList<>();
//		
//		ArrayList<Hut> h3=new ArrayList<>();
//		
//		h1=h3;//child type reference assign to parent type will not work with generic//error
		
//		ArrayList<?> h1=new ArrayList<>();//? means unknown type, called as wild card,type of the data does not matter
//		
//    	ArrayList<Hut> h3=new ArrayList<>();
//    	
//    	h1=h3;
		ArrayList<? extends Home> h1=new ArrayList<>();//upper bound<? extends Home>,
		//it can have any child class reference and parent refence,highest in hierarchy is home
  	    ArrayList<Run> h3=new ArrayList<>();
  	    h1=h3;
  	 
  	    ArrayList<? super Home> h5=new ArrayList<>();//lower bound either or upper hiearachy of human not lower
     	//ArrayList<Hut> h4=new ArrayList<>();//hut is child of home not parent hence error
  	    ArrayList<Object> h4=new ArrayList<>();
  	  h5=h4;
  	    
  	  ArrayList<Home> h6=new ArrayList<>();
  	  h6.add(new Home());
		
  	  ArrayList<Hut> h7=new ArrayList<>();
  	  h7.add(new Hut());
  	  call(h7);
  	  call(h6);
     	
		

	}
	public static void call(List<? extends Home> list)//List is for accepting a collection
	{
		for (Home h:list)
		{
			h.sweet();
		}
	}

}
