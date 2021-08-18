package com.syntaxclass7;

import java.util.Scanner;

public class LotteryWhileOrDoWhile {

	public static void main(String[] args) {
		/*
		 * 
		 * we have a secret number any from 1 to 20
		 * 
		 * ask user the guess the secret number
		 * 
		 * continue guessing a number UNTILL user enter ur secret number
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("TRY TO GUESS MY SECRET NUMBER");

		int secretnumber = 17;

		int guess;
		guess = scan.nextInt();

		while (!(guess == secretnumber)) {
			System.out.println("try again");
			guess = scan.nextInt();
		}

		System.out.println("congrats");

	}

}
