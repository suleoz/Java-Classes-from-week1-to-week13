package com.syntaxclass4;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;

		boolean seconddose = false;

		if (vaccine) { // yes
			System.out.println("How many doses you got ?");

			if (seconddose) {
				System.out.println("you are fully vaccinated.");
			} else {
				System.out.println("you need an other dose");
			}
			System.out.println("end of outer block");

		}

		System.out.println("------------another example of nested if -------");

		int day = 11;
		boolean itsFriday = true;
		if (itsFriday) {
			System.out.println("I am going to watch a movie");
			if (day == 13) {
				System.out.println(" i ll see a scary movie");

			} else {
				System.out.println("i ll watch whatever popular");
			}
		} else {
			System.out.println("I am gonna study");
		}

		System.out.println("-----------------------NEW TASK---------------");

		/*
		 * WE HAVE TEST --> YES-OR If you done test then I want to check the score score
		 * is more than 90 -->A student score is more than 80 -->B student score is more
		 * than 70 -->C student Otherwise --> study more
		 */

		boolean test =true;
		int score = 91;
		score =100;
		if (test) {
			System.out.println("Lets check your score");

			if (score >= 90) {
				System.out.println("A student");

			} else if (score >= 80) {
				System.out.println("B student");

			} else if (score >= 70) {
				System.out.println("C student");

			} else {
				System.out.println("study more");

			}

		} else {
			System.out.println("please take the test");
		}

		
		System.out.println("end of the code");

	
	
	}

}
