package patternofname;

public class StringImmutable1 {

	public static void main(String[] args) {
		String s="vaishu";//String constant pool
		String s1="vaishu";
		System.out.println(s==s1);//== refercance variable is compared
		System.out.println(s.equals(s1));//compare values of string object
		
		String p=new String("praveen");
		String p1="praveen";
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		
		String str="telusko";
		System.out.println(str);
		str.concat("bangaluru");
		System.out.println(str);
		
		String str1=new String("telusko");
		System.out.println(str1);
		String str2=str1.concat("bangaluru");
		System.out.println(str2);
		
		String y="telsu";
		System.out.println(y);
		String y1="tel" + "su";
		System.out.println(y==y1);
		
		String c="chaitu";
		System.out.println(c);
		c=c+ "ban";
		System.out.println(c);
		
		String g="g" +100 +44;
		System.out.println(g);
		
		String g1=100+44+"g1"; 
		System.out.println(g1);
		
		String f="fan";//final impact on address
		f=f+"spin";
		System.out.println(f);
		
		String str5="man";
		str5=str5+"spin";
		System.out.println(str5);
		
		
	}
}