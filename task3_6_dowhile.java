package com.assignment;
import java.util.Scanner;

public class task3_6_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[2];
        int sum =0;
		Scanner sc = new Scanner(System.in);
		char s;
		
		do
		{
			for(int i =0 ; i<2 ;i++)
			{
				System.out.println("enter number");
				 a[i] = sc.nextInt();
				 sum = sum +a[i];
				 System.out.println("sum is" +sum);
			}
				
	     
		System.out.println("Do you want to continue");
		 s = sc.next().charAt(0);	
		
		}
		
		while(s == 'Y' || s == 'y');
		
		System.out.println("we exited the while loop");
	
	}
}	
		    
	


