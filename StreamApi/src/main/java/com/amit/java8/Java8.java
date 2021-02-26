package com.amit.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(10,25,36,45,53,60);
		
		System.out.println(values.stream()
										.filter(Java8::isDivisible)//.filter(i->i%5==0)
										.map(Java8::mapDouble)//.map(i->i*2)
										.findFirst() 
										.orElse(0));
										
		
	}
	public static boolean isDivisible(int i)
	{
		System.out.println("in isDvs = "+i);
		return i%5==0;
	}
	public static int mapDouble(int i)
	{
		System.out.println("in mapDouble = "+i);
		return i*2;
	}
}	
		
		
		
		
		
		
		
		
//		int result = 0;
//		for(int i:values)
//		{
//			result = result+i;
//		}
//		
		//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e)); 
		
		
		
	//c=carry,e=value
		//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c, e)));//for c=carry and e=values
		//System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));
		
//		Function<Integer,Integer> f = new Function<Integer,Integer>()
//				{
//					public Integer apply(Integer i)
//					{
//						return i*2;
//					}
//				};
//		
//		BinaryOperator<Integer> b = new BinaryOperator<Integer>()
//				{
//				
//					public Integer apply(Integer i ,Integer j) 
//					{
//						
//						return i+j;
//					}
//			
//				};
//		
//		Stream s = values.stream();
//		Stream s1 =s.map(f);
//		
//		Integer result =(Integer )s1.reduce(0,b);
//		
//		System.out.println(values.stream());
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		values.forEach(Java8::doubleit);//System.out.println(i) call by value, call by reference , call by method
//	}
//		public static void doubleit(int i)
//		
//		{
//			System.out.println(i*2);
//		}
//		
		
		
		

		
		
		//Consumer<Integer> c  = i-> System.out.println(i);
		
		/*for(int i = 0;i< 6;i++)//fixed certain values for loop used;
		{
			System.out.println(values.get(i));
		}
		
		
		Iterator<Integer> i = values.iterator();//  using for modification;
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		for(int i:values)//printed the all the values;
		{
			System.out.println(i);
		}
		*/
		//External Iterations.
		
		
		
		
		//Internal Iterations. ->
		
		
	






