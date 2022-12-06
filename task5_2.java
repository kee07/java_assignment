package com.assignment;
import java.io.*;


public class task5_2 {

	private static String reversed(String[] str) {
		// TODO Auto-generated method stub
		
       String str1 = " ";
       
		for(int i =0; i<str.length; i++)
		{
		 str1 = str[i]+" ";
		 // System.out.println(str1);
		 for(int j=str1.length()-1 ; j>=0;j--) 
		 {
		  System.out.print(str1.charAt(j));

		 }
	}
		
		return null;
		
	}
	
	
	
	
		public static void main(String[] args) {
		String str[]= "Consultadd pvt".split(" ");
		
		String revered_str= reversed(str);
		
		
	
		
		
	  
	}

		
		
	          
	
}