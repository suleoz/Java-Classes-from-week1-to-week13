package com.syntaxclass5;

import java.util.Scanner;

public class LogicalOperatorstask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your height");
		int inch = sc.nextInt();
		
		if(inch<60) {
			System.out.println("Short");
		}else if (inch>=60 && inch<72) {
			System.out.println("Medium");
		}else if (inch>=72) {
			System.out.println("Tall");
		}
		
		else System.out.println("Please enter valid input");
		
		
		String a= "s";
		String b="b";
		
		
	System.out.println(a.equals(b));
		
		
		
		
		
	}

}
