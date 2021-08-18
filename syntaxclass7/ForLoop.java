package com.syntaxclass7;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * I want to say HI 5 times
		 * 
		 * */ 
		
		// for(initialization ; condition ; increment / decrement) {
		
		// code executedto repeat }
		
		
		
		for (int i =1 ; i<=5; i++) {
			System.out.println("HI");
		}
	
		System.out.println("PRINT NUMBERS 1 TO 10");
		//for (starting poing ; ending point; in/dec){
		
		for (int a=1; a<=10;a++) {
			System.out.print(a+" ");
		}
		
		
		System.out.println("PRINT NUMBERS FROM 20 TO 10");
		
		
		for (int b =20 ; b >=10; b--) {
			System.out.print(b+" ");
		}
		
		
		System.out.println("PRINT EVEN NUMBERS FROM 10 TO 100");
		
		for (int c=10; c<=100; c+=2) {
			System.out.print(c+" ");
			
		}
		
		System.out.println("----syso if icin---");
		 for (int i = 10; i<=100;i++) {
			 if(i%2==0) {
				 System.out.print(i+" ");
			 }
		 }
		
		
		 System.out.println("-------------again from 10 to 100 even numbers---------");
		 
		 
		 for (int i=1;i<=50; i+=10) {
			 System.out.println(i);   // output = 1 11 21 31 41
		 }
		 
	}
	
	
	

}
