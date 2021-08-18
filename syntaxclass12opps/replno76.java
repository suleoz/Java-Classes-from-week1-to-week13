package com.syntaxclass12opps;

public class replno76 {

	public static void main(String[] args) {

		
		// create 2d array of integer values. print sum of all numbers.
		
		
		
		
		int [][] array= {{1,2,3,4,5},
				
						{1,2,3,4,5}};
				
				
		int sum =0;
		
		for (int [] i:array) {
			
			for (int j:i) {
				
				sum=sum+j;
			}
		}
		System.out.println(sum);
		
		
		System.out.println("======================");
		
		int sum2=0;
		
		for(int row=0;row<array.length;row++) {
			
			
			for (int col=0;col<array[row].length;col++) {
				
				sum2=sum2+array[row][col];
				
			}
		}
		System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
