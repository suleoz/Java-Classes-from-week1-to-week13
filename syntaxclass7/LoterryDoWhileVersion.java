package com.syntaxclass7;

import java.util.Scanner;

public class LoterryDoWhileVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in;
		int secretnumber,usernumber;
		secretnumber=17;
		
		in= new Scanner (System.in);
		
		do {
			System.out.println("Please guess the secret number");
		usernumber = in.nextInt();
		
		}while(usernumber != secretnumber);
		
		
		System.out.println("congrats");
		
		
	}

}
