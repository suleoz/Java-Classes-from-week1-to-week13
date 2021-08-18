package com.syntaxclass8;

import java.util.Scanner;

public class TASK3 {

	public static void main(String[] args) {
		// ask the user enter a range int from their start end end point calculate even and odd numbers between
		
		

		
		Scanner input= new Scanner(System.in);
		
		int start,end,sumeven = 0,oddsum=0;
		
		
		
	
			
			System.out.println("please enter range of number that you want to calculate their sum of even/odd ");
			
			start =input.nextInt();
			

			end= input.nextInt();
			
			
			for(int i =start; i<=end;i++) {
				if(i%2==0) {
					sumeven+=i ;
				}else {
				 oddsum+= i;
				}
			}
			
		
		System.out.println("sum of even numbers in your range "+sumeven);
		System.out.println("sum of odd numbers in your range "+oddsum);
		
		
	}

}
