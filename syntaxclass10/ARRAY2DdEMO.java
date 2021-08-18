package com.syntaxclass10;

public class ARRAY2DdEMO {
	
	public static void main(String[]args) {
		
		
		
		int a;
		
		int[] b=new int[3];
		
		int[][]c= new int[3][4];
		
		
		//1st row
		c[0][0]=11;
		c[0][1]=12;
		c[0][2]=13;
		c[0][3]=14;
		
		// 2nd row
		
		c[1][0]=20;
		c[1][1]=30;
		c[1][2]=40;
		c[1][3]=50;
		
		//3rd row
		
		c[2][0]=100;
		c[2][1]=200;
		c[2][2]=300;
		c[2][3]=400;
		
		
		System.out.println(c[1][3]); // 50
		
		
		
		System.out.println("===================");
		
		
		
		
		int [][] array = {
				{11,12,13,14} , // 1 st array
		
					{20,30,40,50}, //2 nd array
				
						{100,200,300,400}	//3rd array
					};
		
		
		System.out.println(array[0][3]); // 14
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
