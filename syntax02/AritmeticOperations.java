package com.syntax02;

public class AritmeticOperations {

	public static void main(String[] args) {

		/*
		 * + ,- , * , / , %
		 */

		int num1 = 90;
		int num2 = 10;

		// syso+control+space
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);

		int sum = num1 + num2;
		System.out.println(sum); // num1+num2 = 100
		
		int sub = num1-num2;
		System.out.println(sub);
		
		
		double n1= 2.99;
		double n2 = 3.05;
		
		double total = n1+n2;
		System.out.println(total);
		
		
		double res = n1/n2 ;
		System.out.println(res);
		
		float f1 =2.99f;
		float f2 = 3.05f;
		float div = f1/f2 ;
		System.out.println(div);
		
		// modulus %  reminder - bolmelerde elde kalani gosterir.
		
		int number1, number2, mod;
		
		number1=10;
		number2 = 3 ;
		mod = number1%number2;
		
		System.out.println(mod);
		
		int guess;
		guess =20+20*2;
		System.out.println(guess);
		
		guess = 2*2+(4+10); // reassign value
		
		System.out.println(guess);
		
		
		
		
		
		
		
		
	}

}
