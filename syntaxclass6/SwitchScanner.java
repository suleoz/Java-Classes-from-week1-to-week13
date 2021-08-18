package com.syntaxclass6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner apple = new Scanner(System.in);
		
		String country , food;
		
		System.out.println("Hey, Where are from?");
		
		country = apple .nextLine();
		
		switch (country) {
		
		case "USA" :
			food = "burger" ;
			break;
		case "Afganistan" :
			food = "Qabeli Palaw";
		break;
		
		case "Peru" :
			food = "cevice" ;
			break ;
			
		case "Italy" :
			food = "pizza" ;
			break ;
		case "tajikistan":
			food = "kurut";
			break ;
		case "Kazakhstan" :
			food = "beshbarmak" ;
			break ;
			
		case "Turkey":
			food = "kebap" ;
			break ;
			
			default :
				food = "invalid";
				break;
		}
		System.out.println("Your traditional food is " + food);
		
		
		
		
		
		
		
		
		
		}
		
	
		

	}

