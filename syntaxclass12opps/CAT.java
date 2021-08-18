package com.syntaxclass12opps;

public class CAT {
	
	
	String name;
	String color;
	int age;
	
	
	void eat() {
		System.out.println(name+" is eating");
	}
	
	void sleep () {
		
		System.out.println(name + " is sleeping");
	}
	
	
	public static void main (String[]args) {
		
		
		CAT cat1=new CAT();
		
		cat1.name="Pilav";
		cat1.color="Black";
		cat1.age=5;
		
		
		cat1.eat();
		cat1.sleep();
			
		
		CAT cat2=new CAT();
		
		cat2.name="Mavis";
		cat2.color="White";
		cat2.age=6;
		
		
		cat2.sleep();
		
		
	
	}

}
