package com.syntax02;

public class AddingOrConcatenating {

	public static void main(String[] args) {
		
		String a="Hello";
		String b ="World!";
		int c= 10;
		int d =20;
		
		System.out.println(c+d+a+b); // 30HelloWorld!
		System.out.println(a+c+b+d); // Hello10World!20
		System.out.println(a+c+d+b); // Hello1020World!
		System.out.println(a+b+c+d); //HelloWorld!1020
		
		String combined =a+b+(c+d);
		
		System.out.println(combined);
		
		String combined1 =a+b+c+d;
        System.out.println(combined1);
		
        char grade ='A';
        
        String str="Student";
       String newest =grade+ " "+str ;
        
        System.out.println(newest);
        
        
        
		
	}

}
