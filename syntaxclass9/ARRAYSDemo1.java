package com.syntaxclass9;

public class ARRAYSDemo1 {

	public static void main(String[] args) {
		
		int num=10;
		
		
		
		int [] arr =new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		
		System.out.println(arr[2]); //30
		
		System.out.println(arr[2] + arr[0]); //40
		
		
		
		// i want to store week days
		
		
		String [] days=new String[7];
		
		days[0]="MONDAY";
		days[1]= "TUESDAY";
		days[2]="WEDNESDAY";
		days[3]="THURSDAY";
		days[4]="FRIDAY";
		days[5]="SATURDAY";
		days[6]="SUNDAY";
		
		System.out.println(days[4]); //FRIDAY
		
		System.out.println(days[4] +" "+ days[6]); // FRIDAY SUNDAY
		
		days[6]="FUNDAY";
		System.out.println(days[4] +" "+ days[6]);
		
		
		
		boolean [] array= new boolean[3];
		array[0]=true;
		array[1]= true;
		array[2]=false;
		
		System.out.println(array[2]); // false
		
		if (array[0]) {
			
			System.out.println("value is true");
		}
		
		
		
		
		
		
		
	}

}
