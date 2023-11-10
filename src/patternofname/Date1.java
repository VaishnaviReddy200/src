	package patternofname;
import java.util.Date;
import java.time.*;
public class Date1 {

	public static void main(String[] args) 
	{
		Date date1=new Date();
		System.out.println(date1);
		
		int month=date1.getMonth();//getMonth means decpecated means old version not to use because of wrong output
		System.out.println("Monteh "+month);
		
		int time= (int)date1.getTime();
		java.sql.Date dt=new java.sql.Date(time);
		System.out.println(dt);
		
		LocalTime time1=LocalTime.now();//joda introduced in java 8
		System.out.println(time1);
		System.out.println(time1.getHour());
		System.out.println(time1.getMinute());
		
		

	}

}
