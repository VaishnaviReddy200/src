package patternofname;

public class StringImmutable {

	public static void main(String[] args) {
		String st="vaishu";
		String st1="vaishu1";
		
		System.out.println(st.equals(st1));//String object are compared
		System.out.println(st==st1);//String reference are compared
		
		String st2="vaishu";//one value is created in String constant pool
		String st3=new String("vaishu");//new will create reference in heap area and copy in String constant pool,two values are created
		
		System.out.println(st2.equals(st3));//String object are compared
		System.out.println(st2==st3);//
		
		String st4=new String("vaishu");//one value is created in String constant pool
		String st5=new String("Vaishu");
		
		System.out.println(st4.equals(st5));//String object are compared//false
		
		System.out.println(st4.equalsIgnoreCase(st5));//true
		
		System.out.println(st4==st5);//false
		
		int res=st4.compareTo(st5);//it compares character by character lexicographically
		
		System.out.println(res);
	}

}
