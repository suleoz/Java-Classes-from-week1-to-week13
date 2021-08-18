package com.syntaxclass7;

public class whileTask1 {

	public static void main(String[] args) {

		// Print numbers from 1 to 100 in 1 line with space

		int a = 1;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println("------task2---------"); // Print numbers from 100 to 1

		int b = 100;
		while (b >= 1) {
			System.out.println(b);
			b--;
		}

		System.out.println("-------task3----------"); // Print even numbers from 20 to 100

		int c = 20;
		while (c <= 100) {
			System.out.println(c);
			c += 2;
		}

		System.out.println("------------task4----------");// Print only odd numbers from 100 to 1

		int d = 100;
		while (d >= 1) {
			if (d % 2 != 0) {
				System.out.println(d);
			}
			d--;
		}

		System.out.println("-------------TASK5-------------");

		int f = 99;
		while (f >= 1) {

			System.out.println(f);
			f -= 2;
		}

	}

}
