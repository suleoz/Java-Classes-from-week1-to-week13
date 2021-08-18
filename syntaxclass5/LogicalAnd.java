package com.syntaxclass5;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean understandJava = true;
		boolean enjoy = true;

		if (understandJava && enjoy) {
			System.out.println("that is great");
		}

		else {

			System.out.println("please spend more time on java");
		}

		/*
		 * T&&T=T T&&F=F F&&T=F F&&F=F
		 */

		int num = 70;
		if (num > 1 && num < 10) {
			System.out.println("Number is small");
		} 
		else if (num > 10 && num < 100) {
			System.out.println("number is medium");
		} 
		else if (num > 100 && num < 1000) {
			System.out.println("number is larger");
		}
		else {
			System.out.println("number is huge");
		}

		
	
		int numa = 1;
		if (numa>0) {
				if (numa >= 1 && numa < 10) {
			System.out.println("Number is small");
		} 
				else if (numa >= 10 && numa < 100) {
			System.out.println("number is medium");
		} 
				else if (numa >= 100 && numa < 1000) {
			System.out.println("number is larger");
		}}
			
		
		else {
			System.out.println("number is huge");
		}

		
	
		
		
	}

}
