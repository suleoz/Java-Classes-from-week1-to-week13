package com.syntaxclass10;

public class ARRAY2DTASK2 {

	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names and second row will contain grades.
		//Then your program should print name of the students that has A and B grade

		
		
		String[][] grade= {
				
				{"SULE","BURCU","TUBA","YUSUF"},
				{"A","B"}
		};
		
		
		System.out.println(grade[0][0] + " is " +grade[1][0]+" grade -"+grade[0][1] + " is " +grade[1][0]+" grade -"+grade[0][2] + " is " +grade[1][0]+" grade-"+grade[0][3] + " is " +grade[1][0]+" grade");
		
		
	}

}
