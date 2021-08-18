package com.syntaxclass10;

public class ARRAY2DTASK1 {

	public static void main(String[] args) {
		
		
		//Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		
		String [][] names = {
				
				{"Mr","Mrs", "Ms","Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
					
		};
		
		
		
		System.out.println(names[0][1] + names [1][0] +","+names[0][0] + names [1][3] +"," +names[0][2] + names [1][2] +"," +names[0][3] + names [1][1] );
		
		System.out.println("==============");
		
		for(int c=0;c<names.length;c++) {// outer loop iterates over rows
			
			for(int d=0; d<names[c].length;d++) { // inner loop iterates over colums
				
				
				System.out.print(names[c][d]+" ");
				
			}
			
			System.out.println();
		}
		
		
		System.out.println("=======================FOR ADVANCE LOOP============");
		
		
		for(String [] arr :names) {
			
			for(String a:arr) {
				
				System.out.println(a);
			}
			
		}
		
		
		
		
		
	}

}
