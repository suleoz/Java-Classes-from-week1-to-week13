package com.syntaxclass9;

public class AdvanceForLoopDemo1 {

	public static void main(String[] args) {

		System.out.println("----------YALNIZCA ARRAY VE COLLECTION LARDA CALSIR--------");

		String [] cars ={"Ford","Toyota","Kia","Tesla","BMW","Audi"};
		
		for(String car : cars) {
			
			System.out.println(car);
		}
		
		
		
		System.out.println("------NEMVERS ARRAY------------");
		
		
		int [] numbers= {100,20,67,45,90,23};

		
		
		for (int a =0; a< numbers.length;a++){
			
			System.out.println(numbers[a]);
		}
		
		
		for (int num:numbers) {
			
			System.out.println(num);
		}
		
		System.out.println("----------CHAR ARRAY-------------");
		
		char[] grade = { 'A', 'B', 'C', 'D', 'E','d','g' };

		
		for(char gr : grade) {
			
			System.out.print(gr+" ");
		}
		
		System.out.println("      ");
		
		System.out.println("-------------I WANT TO PRINT VALUES BACKWARDS--------");
		
		
		
		
		for(int i =grade.length-1;i>=0;i--) {
			
			System.out.println(grade[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
