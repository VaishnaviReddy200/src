package patternofname;
enum Days//it is a class
{
	MON ,TUS ,WED, THUR, FRI ,SAT, SUN;
}
public class Enum {

	public static void main(String[] args) {
	enum Result//based on number of constants in the enum , the constructor is executed so many number of times,by default every enum extends the enum class
	{
		PASS,FAIL,AVERAGE;//enum it is a variable name and values also
		//public static final Result PASS=new Result();
		//public static final Result FAIL=new Result();
		//public static final Result AVARAGE=new Result();
		int marks;
		Result()
		{
			System.out.println("heelo constructor");
		}
		public void setMarks(int marks)
		{
			this.marks=marks;
		}
		public int getMarks()
		{
			return marks;
		}
	}
	
		Days d=Days.MON;
		System.out.println(d);
		System.out.println("#####################");
		Days d1[]=Days.values();
		
		for(Days en:d1)
		{
			System.out.println(en.ordinal()+"- " +en);//ordinal is used to get the index values
		}
		System.out.println	("hello");	
		Result.PASS.setMarks(77);
		int r=Result.PASS.getMarks();
		System.out.println(r);
		Result res=Result.FAIL;
		switch(res)
		{
		case PASS:System.out.println("passed!!");
		break;
		case FAIL:System.out.println("failed!!");
		break;
		case AVERAGE:System.out.println("avarge!!");
		}

	

}
}
