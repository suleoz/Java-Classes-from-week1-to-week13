package com.syntaxclass6;

import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {
		/*
		 * ask user to enter name and age
		 * if age is from 0-3 --> baby
		 * if age is from 3-5--> toddler
		 * if age is from 5-12 --> kid
		 * if age is from 12-19--> teenager
		 * if age is from 19-65--> adult
		 * if age is from 65 + --> senior
		 * */ 
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter your name");
		
		String name = in.nextLine();
		
		System.out.println("Please enter your age");
		
		int age = in. nextInt();
		
		
		String whoAreYou = null;
		
		if (age >=0 && age<3) {
			whoAreYou="baby";
		}else if (age>=3 && age<5) {
			whoAreYou="Toddler";
			
		}else if (age>=5 && age <12) {
			whoAreYou ="kid";
					
		}else if (age>=12 && age <19) {
		
			whoAreYou ="teenager";
		}
		
		 else if(age>=19 && age<65) 
		{
			whoAreYou= "Adult";
		}
		else if  (age>=65){
			whoAreYou = "Senior";
		}
		
       if (whoAreYou!=null ) {
		System.out.println(name + " you are " + whoAreYou);
		
}
		
		

		
		
		
		
		
		
		
	}

}
