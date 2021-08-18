package com.syntaxclass8;

public class NestedLOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 3; i++) {

			System.out.println("I AM (i) LOOP");

			for (int j = 0; j <= 3; j++) {
				System.out.println("I AM j LOOP");
			} 
			System.out.println("--------");
		}
		
System.out.println("====================");

for(int i=1; i<4;i++) {
	
	for (int j=1; j<3; j++) {
		System.out.println(i+" "+j);
	}
	
}


System.out.println("====================");

for(int i=0; i<10;i++) {
	
	for (int j=1; j<10; j++) {
		System.out.println(i+" "+j);
	}
	
}

	}

}
