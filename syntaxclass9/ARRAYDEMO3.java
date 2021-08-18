package com.syntaxclass9;

public class ARRAYDEMO3 {

	public static void main(String[] args) {

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

		int size = grade.length; // only works with ARRAY elements

		System.out.println(size);

		System.out.println(grade[1]);

		int i = 0;
		System.out.println(grade[i]);

		i++;

		System.out.println(grade[i]);

		System.out.println("-------------LOOP---------------");

		for (int a = 0; a < grade.length; a++) { // a<size da yazabilirdik

			System.out.println(grade[a]);
		}
		System.out.println("-------------what if --LOOP---------------");

		//for (int a = 0; a <= size; a++) {
		//	System.out.println(grade[a]); // out of bound
	//	}

		
		
		

		String [] nn= {"Burju","Sule","Enes","Ana","Gurkan","Jose","Blake","Andrei"};
		
		for (int b =0; b < nn.length;b++) {
			
			System.out.println(nn[b]);
		}
		
		
		
		
		
		
		
		
		
	}

}
