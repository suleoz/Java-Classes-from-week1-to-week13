package com.syntaxclass10;

import java.util.Scanner;

public class ArrayScannerTask1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the amound of element that u want to store");
		
		int size = scan.nextInt();
		
		
		double [] array = new double[size];
		
		for( int i=0; i<size;i++) {
			
			System.out.println("please enter the double value to be stored to index "+i);

			array [i] = scan.nextDouble();
			
			
		}

		double total = 0.0;

		for (int a =0 ; a<size ; a++) {
			 
			total = total+ array[a];
	
			}
	
		
		System.out.println(total);
		
	}

}
