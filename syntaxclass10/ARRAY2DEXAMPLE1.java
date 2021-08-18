package com.syntaxclass10;

public class ARRAY2DEXAMPLE1 {

	public static void main(String[] args) {
		
		String [][] food= {
				{"elma","armut","karpuz"},
				{"merimek","nohut","fasulye"},
				{"biryani","samusa","butter chicken"},
				{"adana","iskender","lahmacun","sis kebap"}
		};
		
		
		
		
		System.out.println(food.length);
		
		
		int sizeOf1starray= food[0].length;
		
		System.out.println(sizeOf1starray);
		
		int sizeOf2ndarray= food[1].length;
		
		System.out.println(sizeOf2ndarray);
		
		
		
		
		
		food[3][1]="keto";
		
		System.out.println(food[3][1]);
		
		
		for(int i=0 ; i<food.length;i++) { // iterates over rows/arrays
		
				for(int j=0; j<food[i].length;j++) {// iterates the colums or elements
					
					System.out.println(food[i][j]);
					
				}
			
					
		}
		
		
		
		
		
	}

}
