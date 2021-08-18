package com.syntaxclass7;

public class Task2ForWhileDowhile {

	public static void main(String[] args) {
		
		System.out.println("----------TASK1----------");
		
		for(int a = 1; a<=100; a++) {
			System.out.print(a+" ");
		}
		
		System.out.println("------------TASK2------------"); 
		
		for(int b=100;b>=1;b--) {
			System.out.println(b);
		}
		
		System.out.println("----------TASK3------------");
		for(int c=20; c>=1; c-=2) {
			System.out.println(c+ " ");
		}
		System.out.println("------TASK3 SECOND WAY----");
		
		for (int c=20; c>=1;c--) {
			if(c%2==0) {
				System.out.println(c);
			}
		}
		
		System.out.println("---------TASK4--------");
		
		for(int d=21;d<=50;d+=2) {
			System.out.println(d);
		}
		
		System.out.println("-------TASK 4 SECOND WAY------");
		
		for (int d=20 ; d<=50;d++) {
			if(d%2!=0) {
				System.out.println(d);
			}
		}
		
	}

}
