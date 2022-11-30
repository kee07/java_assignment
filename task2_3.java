//compute quotient and remainder
package com.assignment;
import java.util.Scanner;

public class task2_3 {
		   
		    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter two numbers ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b)
			{
			   System.out.println(" quotient is " + (a/b));
			   System.out.println("remainder is " + (a%b));
			}   
			 else 
				 System.out.println("please type number a bigger thannumber  b");
		 }
	}

