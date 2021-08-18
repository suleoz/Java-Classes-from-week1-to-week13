package com.syntaxclass3;

public class WhatHappens {

	public static void main(String[] args) {

		// int i = 1.99 ; ERROR

		int i = (int) 1.99; // narrowing or explicit casting

		System.out.println(i);

		double d = 100; // widening or implicit casting

		System.out.println(d); // outcome 100.0

		byte b = (byte) 128; // narrowing

		System.out.println(b); // comes out -128

		int num = 20;
		int num1 = 3;
		System.out.println(num / num1); // we divide 2 int values and they do not have decimals

		double num2 = 20;
		double num3 = 3; // conversion from int to double happens
		System.out.println(num2 / num3); // dividing 2 double vale

		float f = 10.99f;
		double nn= 10.99;
		int t = 100;
		
		// we divide 2 int values and only then result are storing in double type
		int n1 = 20;
		int n2 = 3;	
		double dd = n1 / n2; // 6.0
		System.out.println(dd);  //6.0
		
		
	
	
	
	
	
	
	
	
	}

}
