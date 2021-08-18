package com.syntaxclass4;

import java.util.Scanner; // command+shift+o

public class startToScanner {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		
		String value = scan.nextLine();
		
		System.out.println("Hello " +value);
		
		// capture integar value
		
		System.out.println("Please enter your age");

		int age = scan.nextInt();
		System.out.println(value + " is " + age + " year old");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
