package com.assignment;
import java.io.*;


public class task5_1 {

		public static void main(String[] args) {
		String str = "Consultadd";
		String str1 = new String();
		char ch;
		
		for (int i =0; i<str.length(); i++)
		{
		  ch = str.charAt(i);
		  str1 = ch+str1;
		  
			
		}
		System.out.println("Reversed word: "+ str1);
		
	}
}
