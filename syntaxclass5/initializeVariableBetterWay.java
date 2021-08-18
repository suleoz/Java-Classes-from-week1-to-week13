package com.syntaxclass5;

import java.util.Scanner;

public class initializeVariableBetterWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner ss ;
		int num1,num2,num3,largest;
			
		
		ss=new Scanner(System.in);
		System.out.println("please enter 3 different numbers");
		
		num1= ss.nextInt();
		num2 = ss.nextInt();
		num3 = ss.nextInt();
	
		if (num1>num2 && num1>num3 ) { largest=num1;
	
		}
		
		else if (num2>num1 && num2>num3) {
			largest=num2;
		}
		else {
			largest=num3;
		}
		
		
		System.out.println("the largest number is " + largest);
	
// if the largest number is even or odd
	
	if (largest%2!=0) {
	System.out.println(largest + " is an odd number ");
	
	}
	else System.out.println(largest + " is an even number ");
	}
}
