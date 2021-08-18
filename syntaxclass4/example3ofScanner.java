package com.syntaxclass4;

import java.util.Scanner;

public class example3ofScanner {

	public static void main(String[] args) {
		
		
		Scanner apple =new Scanner (System.in);
		
		System.out.println("Please enter  your name ");
		
		String name = apple.nextLine();
		
		System.out.println("hello " + name + " . please enter your surname");
		
		String surname = apple.nextLine();
		 System.out.println("hello " + name +" "+ surname +" Please tell me where are you from ");
		 
		 String country = apple.nextLine();
		 
		 System.out.println("Nice to meet you " +name +" "+ surname + " from " + country);
		
		
		
		
		
		
		
	}

}
