package com.assignment;
import java.io.*;

public class task5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1= "This is java Programming";
		String str2 = "java Programming";
		String str3 = "python Programming";
		
		
		
		int result = str1.indexOf(str2);
	    if(result == -1) {
	      System.out.println(str1 + " not is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is present in the string.");
	    }
		
	    
	    boolean value = str1.contains(str3);
	    if(value == false) {
		      System.out.println(str3 + " not is present in the string.");
		    }
		    else {
		      System.out.println(str3 + " is present in the string.");
		    }
	    
	}
}
	
	