package com.syntaxclass9;

public class NestedRecap {

	public static void main(String[] args) {
		
		
		for(int a =1;a<=10;a++) {
			
			for (int b=1;b<=10;b++) {
				
				System.out.println(a +"X"+b+"="+(a*b));
			}
		}
		
		
		System.out.println("-----------TASK 2--------------");
		
		
		for(int a=0; a<=2;a++) {
			
			
			for(int b =0; b<=9;b++) {
				
				 if(a==2 && b==4 ) {
						break;
						}
					 
				
				for (int c =0;c<=5;c++) {
					
					
					for(int d=0; d<=9;d++) {
						
						System.out.println(a+""+b+":"+c+""+d);
						
						 
						 
						 
						 
	
					}
				}
			}
			
			
		}
		
		
		System.out.println("--------------- YUKARDAKININ AYNISI-----FARKLI SEKILDE");
	
		String	min = "" , hour = "" ;
		
		
		for( int h=0; h<=23;h++) {
			
			for  (int m =0; m<=59;m++) {
				
				if (h<10) {
					hour = "0" +h;
					
					
				}else {
					
					hour = "" + h;
					
				}
				
				if (m<10) {
					
					min= "0" +m;
					
				}else {
					
					min = "" +m;
				}
				
				System.out.println(hour + ":"+ min);
			}
		}
		
		
		
		
		System.out.println("-------------WHAT IUS THE OUTPUT---------");
		
		
		
		for(int i =0 ; i<=3;i++) {
			System.out.println("outer loop " +i);
			
			for (int j=0;j<3;j++) {
				
				System.out.println("inner loop "+j);
				
			}
			System.out.println("-------");
			
			break;
		}
		
		
		System.out.println("------------- baska yere break koyarsak-------");
		
		
		for(int i =0 ; i<=3;i++) {
			System.out.println("outer loop " +i);
			
			for (int j=0;j<3;j++) {
				
				System.out.println("inner loop "+j);
				break;
				
			}
			System.out.println("-------");
			
		
		}
		
		
		System.out.println("------------- baska yere continue koyarsak-------");
		
		
		
		for(int i =0 ; i<=3;i++) {
			System.out.println("outer loop " +i);
			
			for (int j=0;j<3;j++) {
				
				System.out.println("inner loop "+j);
			continue;
			
			}
			System.out.println("-------");
			
		
		}
		
		
		System.out.println("------------- for loop break continue -------");
		
		
		
		boolean boo=true;
		
		
		for (int i=1;i<3;i++) {
			System.out.println("OUTER LOOP");
			
			while (boo) {
				
				System.out.println("INNER WHILEEE"); // without break NOT STOPSS PRINT THIS . NO CHANCE TO INC I
			
				
				break;  /// OUTER-INNER-OUTER INNER
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
