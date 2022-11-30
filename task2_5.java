
package com.assignment;
import java.util.Scanner;

public class task2_5 {

		   
		    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter markes in 3 subjects ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			float sum = (a +b +c) ;
			float percentage = (sum /3);
			
			if(percentage >75.0 && percentage <90.0)
	
			   System.out.println(" ------I division------");
			   
			 else if (percentage >75 && percentage <90 )
				 System.out.println(" ------II division------ ");
			
			 else if (percentage >65 && percentage <75 )
				 System.out.println(" ------III division------");
			
			  else
				System.out.println(" ---- FAIL-----------");			
 
		    }
}
