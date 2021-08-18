package com.syntaxclass7;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 *ASK NAME AND AGE FROM A USER 3 TIMES 
		 * 
		 * PRINT NAME+AGE
		 * 
		 * */
		
		Scanner scan;
		
		String name;
		int age ;
		
		
		scan =new Scanner(System.in);
		
		int i =1;
		while(i<=3) {
		
		
		System.out.println("Please enter your name");
		name= scan.next();
		
		
		System.out.println(name +" Enter your age");
		age = scan. nextInt();
		
		System.out.println(name + " is" +age+ " years old");
		
		i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
