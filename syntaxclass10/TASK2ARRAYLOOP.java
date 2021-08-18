package com.syntaxclass10;

import java.util.Scanner;

public class TASK2ARRAYLOOP {

	public static void main(String[] args) {
		

		
String [] country= {"TURKEY","USA","ITALY"};

String capital=null;

for(String a:country) {
	
	if(a.equals("TURKEY")) {
		capital="ANKARA";
	}
	else if(a.equals("USA")) {
		capital="WASHINGTON DC";
	}
	else if(a.equals("ITALY")) {
	capital= "ROME";
	}
	System.out.println("capital of "+a+" is "+capital);
	
}	










} 
		
		
		
		
		
	}


