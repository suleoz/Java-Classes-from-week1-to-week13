package com.syntaxclass11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] twoDarray= {{1,2},
				{3,4,5},
				{6,7,8,9,10,11,12}};
		
		int howmanyarrays=twoDarray.length;
		
		System.out.println(howmanyarrays);
		
		System.out.println(twoDarray[2].length);
		
		
		for(int [] i:twoDarray) {
			
			for(int j:i) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("===========================");
		
		
		for (int i=0; i<twoDarray.length;i++) {
			
			for (int j=0; j<twoDarray[i].length;j++) {
				
				
				System.out.print(twoDarray[i][j]+" - ");
			}
		}
		
		
	}

}
