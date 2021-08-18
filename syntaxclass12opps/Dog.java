package com.syntaxclass12opps;

public class Dog {

	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		
		System.out.println("Dog can bark");
	}
	
	void sleep () {
		System.out.println("Dog can sleep");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog dog1 = new Dog();
		
		dog1.name="james";
		dog1.breed="bull dog";
		dog1.color="white";
		dog1.age=20;
		dog1.height=15;
		dog1.gender='M';
		
		
		dog1.bark();
		dog1.sleep();
		
		System.out.println("=====DOG2======");
		
		Dog dog2=new Dog();
		
		dog2.name="bongo";
		dog2.breed="Shitzu";
		dog2.color="blue";
		dog2.age=5;
		dog2.height=10;
		dog2.gender='F';
		dog2.sleep();
		
		
		

	}

}
