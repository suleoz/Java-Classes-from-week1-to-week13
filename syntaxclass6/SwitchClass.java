package com.syntaxclass6;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 7;

		// if satatement is a condition based statement
		
		//if else if is like latter
		
		
		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("today is Wednesday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		}

		else {
			System.out.println("invalid");
		}

		System.out.println("------USING SWITCH STATEMENT--------");

		// switch is a value based statement. if find matching value case and jumps right away.
		//switch is like an elevator
		
		
		/*in switch ralways =
		 * variable type and case values MUst be of same datatype
		 * 
		 * default :--> optional
		 * 
		 * it has some limitations. switch only check equality.
		 * that means u cannot use relational operations such us >= , + ||&&
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		String dayName;
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;

		default:
			dayName = "Invalid";
			break;
		}

		System.out.println("today is " + dayName);

	}

}
