package com.syntaxclass12opps;

public class carTested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CARS car1=new CARS();
		
		car1.make="Toyota";
		
		car1.model="4Runner";
		
		car1.color="Black";
		
		car1.year=2020;
		
		System.out.println("i have "+car1.make);
		
		car1.moveForward();
		
		
		
		CARS car2=new CARS();
		
		car2.make="TESLA";
		car2.model="S";
		car2.color="Black";
		car2.year=2021;
		
		car2.moveBackward();
		
		
		
		
	}

}
