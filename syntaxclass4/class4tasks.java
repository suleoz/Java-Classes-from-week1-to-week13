package com.syntaxclass4;

public class class4tasks {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 4.5;

		if (diploma) {
			System.out.println("CONGRATULATIONS!");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship!");

			} else {
				System.out.println("you should have studied harder!");

			}
		}

		else {
			System.out.println("oww that s a bummer");
		}

		System.out.println("---------TASK 2---------");

		double mrate = 3.5;
		double mprice = 3000000;

		if (mrate < 4.5) {
			System.out.println("user might buy a house");

			if (mprice > 200000) {
				System.out.println("consider take a loan");

			}
		} else {
			System.out.println("sorry you cannot buy a house");
		}

		System.out.println("------task3-----");

		int donor = 25;
		int weight = 100;

		if (donor >= 18) {
			System.out.println("okey lets check your weight");

			if (weight >= 110) {
				System.out.println("you are eligible");

			} else {
				System.out.println("sorry you are not eligible -under weight");
			}

		} else {
			System.out.println("not eligible");
		}

	}

}
