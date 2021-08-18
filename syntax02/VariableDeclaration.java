package com.syntax02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 way declare variable and assign the value
	int num = 10;
	
	// 2 way
	int number ;  // declare later
	
	number = 100;  // initialize or assign the value
	
	
	
	
	// declare multiple variables of same type
	
	double num1,num2,num3;
	num1 = 1.99;
	num2 = 2.99;
	num3 = 3.99;
	
	// double num3 = 3.99; eger boyle yazarsan dublicate i var diye error verir
	
	System.out.println(num1+num2+num3);
	 
	System.out.println(""+num1+" "+num2+" "+num3);
	
	double num4 = num1+num2+num3;
	
	System.out.println(num4);
	
	
	}

}
