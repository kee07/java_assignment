// checking no is positive or negative

package com.assignment;
import java.util.Scanner;

public class task2_1 {
	     int number;

	
	
      
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();
		
		task2_1 t = new task2_1();
		t.number = a;
		
		if(t.number >0)
		   System.out.println(t.number + " is a positive number");
		else
			System.out.println(t.number + " is a negative number");
		  
		 
	 }
}

