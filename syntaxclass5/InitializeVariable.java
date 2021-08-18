package com.syntaxclass5;

import java.util.Scanner;

public class InitializeVariable {

	public static void main(String[] args) {
		/*
		 * ask user 3 numbers
		 * find the largest
		 * */ 

		
		Scanner ss ;
		int num1,num2,num3;
			
		
		ss=new Scanner(System.in);
		System.out.println("please enter 3 different numbers");
		
		num1= ss.nextInt();
		num2 = ss.nextInt();
		num3 = ss.nextInt();
		
		if (num1==num2 && num2==num3 && num1==num3) {System.out.println("numbers are equal");
		}
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1+" is the largest.");
		}
		else if (num2>num1&& num2>num3) {
			System.out.println(num2 + " is the largest ");
		}
		else if (num3>num1 && num3 >num2) {
			System.out.println(num3 + " is the largest");
		}
		
		
	
			
		else System.out.println("plz enter valid numbers");
		
		
	}

}
