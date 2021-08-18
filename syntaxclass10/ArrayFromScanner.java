package com.syntaxclass10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {

		
		/*
		 * USE SCANNER TO CREATE AN ARRAY INT ELEMENTS;
		 
		 * 
		 * */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many elements do you want to store in the array?");
		
		int size =scan.nextInt();
		
		
		int [] numbers = new int[size];
		
		for (int i=0;i<size;i++) { // i< numbers.lenght de yazilabilirdi
			
		System.out.println("please enter value to be stared to index "+i);
			
		 numbers[i] = scan.nextInt();
						
		}
		
		
		System.out.println(" DISPLAY ALL THE ELEMENTS FROM THE ARRAY  ");
		for(int num:numbers) {
			System.out.print(num+" ");
		}
	}

}
