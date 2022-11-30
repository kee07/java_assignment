package com.assignment;
import java.util.Scanner;

public class task1_5 {
      
      int radius;
      double area;
     public task1_5(int radius) {
    	
    	 double pi = 3.14;
    	 this.radius = radius;
    	  area = (pi* this.radius* this.radius);
    	  
     }
 
      
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius ");
		int a = sc.nextInt();
		
		task1_5 t = new task1_5(a);
		
		System.out.println("area is: " + t.area);
		  
		 
	 }
}


