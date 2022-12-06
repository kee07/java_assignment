package com.assignment;
import java.util.*;
import java.util.Scanner;

public class task5_8 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("enter string");
			String message = sc.next();; int vcount=0;
			int ccount=0;

			 str= str.toLowerCase(); 
			
			for (int i=0;i <str.length(); i++)
			{
			
				if(str.charAt(i) =='(' ||str.charAt(i) =='{' || str.charAt(i) =='[' || str.charAt(i) ==']' || str.charAt(i) =='}'
						|| str.charAt(i) ==')' )
				{
					vcount++;
					
				}
				else if(str.charAt(i)>= 'a' && str.charAt(i)<= 'z')
				{
					ccount++;
					
				}
				
			}
			
			   System.out.println("Number of vowels: " + vcount);    
		        System.out.println("Number of consonants: " + ccount);  
		}

}
