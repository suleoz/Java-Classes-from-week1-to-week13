package com.syntaxclass5;

public class LocigalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean b = !true;
		
		boolean s = !false;
		
		System.out.println(b);
		
		System.out.println(s);
		
		
		boolean hungry = true;
		
		if (!hungry) {
			System.out.println("I am not hungry"); // because hungry!= true -- it s not executed.
		}
		
		boolean hngry = false ;
		if (!hngry) {
			System.out.println("i am not hungrry");
		}
		
		
		boolean hot = false;
		
		if (hot) {
			System.out.println("I ll go out");
		}
		else if (!hot) {
			System.out.println("i ll stay ");
		}
		
		
		
System.out.println("LOGICAL NOT ! FOR STRINGS");
		
		String name ="Sall";
		
		if (!name .equals ("Sule")) {
			System.out.println("No i m not looking for u");
		}
	}

}
