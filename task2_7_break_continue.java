package com.assignment;
import java.util.Scanner;

public class task2_7_break_continue {
	
	public static void main(String[] args) {
	  int number;	
	  Scanner sc = new Scanner(System.in);
	    
  while(true) {
	  System.out.println("enter any number");
	  number = sc.nextInt();
	 
      if(number <0)
      {
	  break;
      }
	  if(number >0)
      {
		  System.out.println("Good going");
		  continue;
  
        }
	  
      }
	  System.out.println("It's over");
	}
}

