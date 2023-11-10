package patternofname;
//Stream ApI-java8-2014 to work on big data 
//to Map,REDUCE,FILTER
//functional programming,go=function(){}
//mutation -good
//threads-good
//Mutation+Thread=bad(race condition)
//all the methods of stream are lazy functions with out terminatal methods it is not called
import java.util.stream.Stream;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
public class StreamApi {

	public static void main(String[] args) 
	{
		List<Integer> nums=Arrays.asList(13,60,70,80,90);
//		Stream<Integer> stream=nums.stream();//to store the cope of data
//		Stream<Integer>stream1=stream.sorted();
		
		Function<Integer,Integer> fun=new Function<Integer,Integer>()//anaymous class,it take two things taking integer and returning is integer
				{
            @Override
			public Integer apply(Integer s)
			{
				return s*2;
			}
			
			
				};
//				//Function<Integer,Integer>fun=n->n*2;//lambda
		Predicate<Integer> p=new Predicate<Integer>()//filter need object of predicate
				{
			public boolean test(Integer x)
			{
				System.out.println("hi Stream");
				return x%2==0;
			}
				};
		//Predicate<Integer> p=x->x%2==0;//lambda expression
//		Stream<Integer>stream3=stream1.filter(x->x%2==0);
//		Stream<Integer>stream4=stream3.map(n->n*2);
//stream4.forEach(x->System.out.println(x));
		BinaryOperator<Integer> bi=new BinaryOperator<Integer>()  
		{
			public Integer apply(Integer c,Integer e)
			{
				return c+e;
			}
		};
				
		//Optional<Integer> count=nums.stream()
		Integer sum=nums.stream()
		.sorted()
		.filter(p)
		.map(x->x*2)
		//.count();//terminate
		//.findFirst();//finds the first element
		.reduce(0,bi);//will take all values and output will be only one value,it take binary opertaor
		//System.out.println(count.toString());//count is object of optional
		System.out.println(sum);
		//.forEach(x->System.out.println(x));only if we use the terminate then it will print,else no methods will be called

	}

}
