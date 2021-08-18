package com.syntaxclass7;

import java.util.Scanner;

public class TASK4PSthatsachallange {

	public static void main(String[] args) {
		
		//Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		//If user give more money program should return a change.
		// Whenever a user done with payments program should say “Thank you for shopping!”


		
		Scanner apple= new Scanner(System.in);
		
		
		System.out.println("please enter the item");
		
		String item=null;
		
		item=apple.nextLine();
		
		int price=0,money=0,total=0, change=0;
		
		
		System.out.println("please enter the price of the item");
		
		price=apple.nextInt();
		
		System.out.println("please do the payment");	
		
		do {
		
			money=apple.nextInt();
			total+=money;
			
			if (total>price) {
				
				change= total-price;
				System.out.println("thank you there is your change "+change);
				break;
				
			}else if (total<price) {
				
				System.out.println("please give "+ (price-total));
				
			
			}
		}while (total!=price);
	
		System.out.println("thank you for shopping");
		
		
	}
	 
	

}
