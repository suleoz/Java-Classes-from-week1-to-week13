package com.syntaxclass8;

public class ContinueKeywordDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =0; i<=3;i++) {
			
			if(i==1) {
				continue;
				
			}
		System.out.println("i m insid ethe loop");
			System.out.println(i);
		}
		
		
		for (int i=1; i<=10;i++) {
			
			if(i==5 || i==9) {
				continue;
			}
			System.out.print(i+"  ");
		}
		
		
		
	}

}
