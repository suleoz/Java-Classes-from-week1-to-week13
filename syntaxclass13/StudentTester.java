package com.syntaxclass13;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student Sule=new Student();
		
		Sule.name="Sule";
		Sule.id="123";
		Sule.gender='F';
		Sule.tutition=100;
		Sule.school="Syntax";
		Sule.study();
		Sule.payTutition();
				
		Student Burcu=new Student();
		
		Burcu.name="Burcu";
		
		Burcu.tutition=100;
		Burcu.school="Syntax";
		
		Burcu.study();
		Burcu.payTutition();
	}

}
