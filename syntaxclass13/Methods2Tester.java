package com.syntaxclass13;

public class Methods2Tester {

	public static void main(String[] args) {
		
		
		
		Methods2 methods=new Methods2();
		
		double result= methods.getMax(12,160);
		System.out.println();
		
		System.out.println(methods.getMax(12, 160));
		
		//double result2=getMaxWithoutReturn(2, 13);
		
		System.out.println(methods.getMax(150, 2));
		
		double result2=methods.getMax(100,10000 );
		System.out.println(methods.getMax(100,10000 ));
		
		
		methods.getMaxWithoutReturn(1, 2);
		
		
		
		
		
	}

}