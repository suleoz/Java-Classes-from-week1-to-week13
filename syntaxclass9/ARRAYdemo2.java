package com.syntaxclass9;

public class ARRAYdemo2 {

	public static void main(String[] args) {

		double[] d = new double[4];
		// d [0] = 0.
		d[1] = 10.99;
		d[2] = 11.99;
		d[3] = 10;

		System.out.println(d[0]); // output = 0.0 'default value' suna gider

		System.out.println("------------- what if-------------");

		double[] f = new double[4];
		
		// f [0] = 0.
		f[1] = 10.99;
		f[2] = 11.99;
		f[3] = 10;
		//f[4] = 44.8; // array index out of bounds

		//System.out.println(f[4]); // error veririr cunku 4 box var sen
		// 5 yerlestirmeye calisiyorsun. 22 line hatali sil

		System.out.println("------------- what if-------------");
		
		
		int []number= new int[2];
		number[0]=100;
		number[1]=200;
		
		System.out.println(number[1]);
		
	//	System.out.println(number[2]);  ArrayIndexOutOfBoundsException:  error
		
		
		
		int num; // declare a variable
		
		int arrayVar[];  // declare array
		int []arr;   // preffered way to write the syntax
	
		
		arr = new int[3];
		
		arr[0]=10;
		
		System.out.println(arr[2]); /// output =0
		
		
		
		
		
		
		
		
	}

}
