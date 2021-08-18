package com.syntaxclass7;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// i wanna print "How are you 10 times"
		
		
		
		
		int a=0;
				while (a<10) {
					System.out.println("How are you");
					a++;	
				}
		
		System.out.println("i want to print numbers 1 to 20");
		
		int i=1;
		while(i<=20) {
			System.out.println(i);
		i++;
		}
		
		
		System.out.println("i want to print 100-110");
		
		
		
		
		int b= 100;
		
		while (b<=110) {
			System.out.print(b+" ");
		b++;
		}
		
		System.out.println("Numbers from 10 to 1");
		
		
		
		int c=10;
		while(c>=1) {
			System.out.println(c);
		c--;
		}
		
		
		System.out.println("----i want to print odd numbers from 1to 20---------");
		
		int d=1;
		while(d<=20) {
		
		System.out.println(d);
		d+=2;
		}
		
		System.out.println("or you can write odd n like =");
		
		int e =1;
		
		while (e<21) {
			if(e%2!=0) {
				System.out.println(e);
				
			}
			e++;
		}
		
	}

}
