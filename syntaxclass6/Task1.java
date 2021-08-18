package com.syntaxclass6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("Is there any sale?");

		String sale;

		double price = 0.0;

		double discount = 0.0;

		sale = scan.next();

		if (sale.equals("yes")) {

			System.out.println("what dou you wanna puchase?");

			String item = scan.next();

			System.out.println("What is the item's price?");
			price = scan.nextDouble();

			if (price < 20) {
				discount = price - (price * (0.1));

			} else if (price >= 20 && price < 100) {
				discount = price - (price * (0.2));

			} else if (price >= 100 && price < 500) {
				discount = price - (price * (0.3));
			}

			else if (price >= 500) {
				discount = price - (price * (0.5));
			}
			System.out.println("After discount the price of the item reduced from " + price + " to" + discount);
		}

		else {
			System.out.println("no shopping");
		}

	}

}
