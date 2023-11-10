package patternofname;
//Annotation works based on mechanism of Interface
//@-compiler that annotation type is being created and its not interface

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.TYPE})//for user defined annotation we need to define two things 1.target and 2.till where(ratention)
@Retention(RetentionPolicy.RUNTIME)
@interface cricket//user defined annotation
{
	String country() default "indis";
	int age() default 33;
}
//@cricket(country="india",age=32)
@cricket class kapil
{
	@cricket int runs;
	
	@cricket public kapil()
	{
		System.out.println("hello kapil");
		
	}
	public void setRuns(@cricket int runs)
	{
		this.runs=runs;
		 int match=2;
	}
}
public class Annotations {

	public static void main(String[] args) 
	{
		kapil k=new kapil();
		k.setRuns(233);
		java.lang.Class<? extends kapil> c=k.getClass();//get class
		//System.out.println(c);
		Annotation a=c.getAnnotation(cricket.class); 
		cricket c1=((cricket)a);
		System.out.println(c1.age());
		System.out.println(c1.country());
		

	}

}
