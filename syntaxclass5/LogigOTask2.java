package com.syntaxclass5;

import java.util.Scanner;

public class LogigOTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc;
		sc=new Scanner (System.in);
		System.out.println("please enter day number 1 to 7");
		int day = sc . nextInt();
		
		if (day>= 1 ||day<=5 ) {
			System.out.println("It is a weekday.");
		}
		else if (day==6 || day==7) {
			System.out.println("It s weekend.");
		}
		
		else System.out.println("please put a valid number");
		

	}

}
