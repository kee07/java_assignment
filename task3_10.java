package com.assignment;
import java.util.Scanner;
public class task3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
	    int rows = sc.nextInt();
		int i,j,k,o;
	 
	    //Prints upper half  pattern  
	  for(i=1; i<=rows ; i++)
	  {
		  for(j=1; j<= 2*i-1 ; j++)
		  {  
			  System.out.print("*"); 
			  
		  }
		    
		  System.out.println(" ");
	  }
		  
	   //Prints lower half  pattern  

	  for ( i=rows; i<= 2*rows-1 ; i++)  
		 {  
		 for ( j = 1; j <= i ; j++)   
		 {  
		 System.out.print(" ");  
		 }  
		 System.out.print("*");  
		 
		 }  
	 
	 }
	  
	  
	}
	