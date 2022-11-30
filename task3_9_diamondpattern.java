package com.assignment;
import java.util.Scanner;

public class task3_9_diamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
	    int n = sc.nextInt();
		
		//Doing it for 5 lines to print *
		 for (int i=1; i<=n; i++)
		 {
			 for (int j =n; j>i ; j--)
			 {
			     System.out.print(" ");
			 }
			 System.out.print("*");	
			 
			
			 for (int k = 1; k < 2*(i -1) ;k++)   
			 {   
			 System.out.print(" ");   
			 }  
			 if(i==1)   
			 {   
			 System.out.println(" ");  
			 }  
			 else  
			 {  
			 System.out.println("*");   
			 }  
		 }   
		 
		  for (int i=n-1; i>= 1 ; i--)  
			 {  
			 for (int j = n; j > i ; j--)   
			 {  
			 System.out.print(" ");  
			 }  
			 System.out.print("*");  
			 
			 for (int k = 1; k < 2*(i -1) ;k++)   
			 {  
			 System.out.print(" ");  
			 }  
			 if(i==1)  
			 System.out.println("");  
			 else  
			 System.out.println("*");  
			 }  
		 
		 }
		
	}


