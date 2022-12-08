package com.assignment;

public class task7_2 {
		   public static void main(String args[]) {
		      int myArray1[] = {23,67,55,90,13};
		      int myArray2[] = {21,45,67,78,13};
		      System.out.println("Intersection of the two arrays ::");
		     
		      for(int i = 0; i<myArray1.length; i++ ) {
		         for(int j = 0; j<myArray2.length; j++) {
		            if(myArray1[i]==myArray2[j]) {
		               System.out.println(myArray2[j]);
		            }
		         }
		      }
		   }
		}
		
		
