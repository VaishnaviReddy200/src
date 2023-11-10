package patternofname;

public class StringMethods {

	public static void main(String[] args) {
		String s="Vaishnavi";
		System.out.println(s.toUpperCase());
     	System.out.println(s.charAt(2));//i
     	System.out.println(s.contains("s"));//true
     	System.out.println(s.contains("l"));//False
     	System.out.println(s.substring(2, 6));
     	System.out.println(s.substring(2));
     	System.out.println(s.indexOf("n"));
     	System.out.println(s.lastIndexOf("a"));
     	System.out.println(s.length());
     	System.out.println(s.startsWith("v"));
     	System.out.println(s.startsWith("V"));
     	//System.out.println(s.split("a"));
     	
     	char ch[]=s.toCharArray();//string to array conversion
     	
     	for (char c:ch)
     	{
     		System.out.println(c);
     	}
     	 
     	String s1[]=s.split("v");
     	for (String c:s1)
     	{
     		System.out.println(c );
     	}

	}

}
