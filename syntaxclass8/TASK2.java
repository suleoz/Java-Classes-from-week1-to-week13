package com.syntaxclass8;

import java.util.Scanner;

public class TASK2 {

	public static void main(String[] args) {
	
		
		// Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking
		
		Scanner scan =new Scanner (System.in);
	
		
		
		String input;
		
		
		do {
			System.out.println("do you want to apply a credit card?");
			input=scan.nextLine();
			
			if(input.equalsIgnoreCase("yes")) {
				break;
			}
			
			
		} while (true) ;
		
		
		System.out.println("great");
		

	}

}
