package com.syntaxclass3;

public class IfWithNoBraces {

	public static void main(String[] args) {

		int tem1 = 80;

		if (tem1 < 32)
			System.out.println("Water will freeze with temperature" + tem1);
		else
			System.out.println("water will not freeze with temperature " + tem1);
		System.out.println("it is warm outside");

		/*
		 * when if satement is used without {} then 
		 * java allows only 1 statement for each block  
		 * meaning 1 line for if blobk and 1 line for else block only -- then the others will
		 * come as well
		  */
		
		
		int num1 =20;
		int num2 =20;
		if (num1>num2) { System.out.println(num1 + "is larger than" + num2); }
		else {System.out.println(num2 +"larger than" + num1);}
		
		
		// if you have multiple condition to test  if (condition) { code .... } 
		//else if (condition) { --code 
		// else { code....
		
		
		
		
		
		

	}

}
