package com.syntaxclass7;

import java.util.Scanner;

public class reviewtoclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int num1=0;
		int num2=0;
		char operator;
		Scanner calc;
		double result=0.0;
		
		calc=new Scanner(System.in);
		System.out.println("Please enter fist number");
		num1=calc.nextInt();
		System.out.println("Please enter second number");
		num2=calc.nextInt();
		System.out.println("What operation do we need to perform?");
		operator=calc.next().charAt(0);
		
		
		switch (operator) {
		case '+':result=num1+num2;
		break;
		case '-':result=num1-num2;
		break;
		case '*': result=num1*num2;
		break;
		case '/': result=num1/num2;
		break;
		
		
	}
if (result!=0) {System.out.println(num1+" " + num2);
}
		
		// canvasta orijinali vart oradan mutlaka al
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
