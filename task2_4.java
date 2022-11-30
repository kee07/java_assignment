//leap year
package com.assignment;
import java.util.Scanner;
	
	public class task2_4 {
			   
			    public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter any year ");
				int year = sc.nextInt();
				
				
				if(year%4 ==0 )
		
				   System.out.println(" its a leap year");
				   
				 else if (year %400 == 0)
					 System.out.println(" its a leap year");
				 else

                  System.out.println("Year "+year+" is not a Leap Year");
     
			    }
			    }