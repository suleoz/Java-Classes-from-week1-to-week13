package com.syntaxclass4;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		
		//compare 2 numbers and see which one is the largest
		
		Scanner comp = new Scanner (System.in);
		System.out.println("please enter first number");

		int number = comp.nextInt();
		
		System.out.println("please enter second number");
		
		int number2= comp.nextInt();
		
		if (number>number2) { System.out.println(number+ " is larger then "+ number2);
		
		}else if (number<number2) {System.out.println(number +" is smaller " + number2);
		
		}else {System.out.println(number+ " is equal to " +number2);
		}
		
	

		
		
		
		
	}
		
	
		
	}

