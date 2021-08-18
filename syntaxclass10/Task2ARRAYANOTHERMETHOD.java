package com.syntaxclass10;

public class Task2ARRAYANOTHERMETHOD {

	public static void main(String[] args) {
		
		
		
		String [] countries= {"TURKEY","USA","ITALY"};
		
		
		String capital="";
		
		for( int i=0 ; i<countries.length;i++) {
			
			switch(countries[i]) {
			
			case "TURKEY":
				
			capital="ANKARA";
			break;
			
			case "USA":
				capital="DC";
				break;
				
			case"ITALY":
				capital="ROME";
				break;
		
			}
			
			System.out.println("The country of "+ countries[i]+" is "+capital);
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
