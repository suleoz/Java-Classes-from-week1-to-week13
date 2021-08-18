package com.syntaxclass5;

public class LogicalOr {

	public static void main(String[] args) {
		
		/* define a day
		 * if day is Monday or Friday --> no class
		 * if day is Tuesday or Wednesday --> manuel testing
		 * if day is Thursday --> review class
		 * if day is Saturday or Sunday --> Java claSS
		 * 
		 * */
		
		
		String day ="Sundayd";
		
		if (day.equals ("Monday")  ||  day.equals ("Friday")) {
			System.out.println("No class");
		} else if (day .equals ("Tuesday")|| day.equals("Wednesday")) {
			System.out.println("Manuel testing class");
		} else if (day.equals("Thursday")) {
			System.out.println("Review class");
		}
		
		else if (day.equals ("Sunday")  ||  day.equals ("Saturday")){System.out.println("Java class");
		}
		
		else System.out.println("please enter valid day");
		
		
		
	
		
		
		
		

	}

}
