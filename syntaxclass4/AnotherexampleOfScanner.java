package com.syntaxclass4;

import java.util.Scanner; // cmmd+shift+o

public class AnotherexampleOfScanner {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("please enter city");
		String city = input.nextLine();

				
		
		
		System.out.println("Please Enter Temperature");
		 double temp =input.nextDouble();
		
	
	System.out.println("it is " + temp + " in " + city );
		
		
		
		
		
		
		
		

	}

}
