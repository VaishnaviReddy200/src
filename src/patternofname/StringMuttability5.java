package patternofname;

public class StringMuttability5 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("teluso");
		System.out.println(s);
		s.append("ban");
		System.out.println(s);
		
		StringBuilder s1=new StringBuilder("veen");
		System.out.println(s1);
		s1.append("bank");
		System.out.println(s1);
		
		System.out.println(s1.capacity());//16 bits by default + 4 bits from constructor
		
		StringBuffer str=new StringBuffer();
		str.append("hi paveen");
		System.out.println(str.capacity());
		str.append("heelo to this worlad bu ");
		System.out.println(str.capacity());//16*2+2
		
		final StringBuffer str1=new StringBuffer("vaishu");//final as no impact on mutability it only affect the address in final so,we can not change the reference to another variables
		System.out.println(str1);
		str1.append("telusu");
		System.out.println(str1);

	}

}
