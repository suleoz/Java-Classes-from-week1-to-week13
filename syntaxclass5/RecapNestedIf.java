package com.syntaxclass5;

import java.util.Scanner;

public class RecapNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan;
		String visa;
		int years;
		scan = new Scanner(System.in);
		
		System.out.println("Did you get your visa?");
		visa =scan.next();
		
		
		if (visa.equals("yes")) {
			System.out.println("Congrats, how long is your visa for?");
			
			years = scan . nextInt();
			
			if (years>1) {
				System.out.println("that is awesome");
			} else {
				System.out.println("you have to go back in 1 year");
			}	
			
		}
		

		else { System.out.println("Try to get one");
		}
		
		
		
		
		
	}

}
