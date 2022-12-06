package com.assignment;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class task5_3 {

	    static int NO_OF_CHARS = 256;
	 
	    static boolean areAnagram(char str1[],
	                              char str2[])
	    {
	   
	        int count1[] = new int[NO_OF_CHARS];
	        Arrays.fill(count1, 0);
	       
	        int count2[] = new int[NO_OF_CHARS];
	        Arrays.fill(count2, 0);
	        int i;
	 
	      
	        for (i = 0; i < str1.length &&
	             i < str2.length; i++)
	        {
	            count1[str1[i]]++;
	            System.out.print(str1[i]);
	            count2[str2[i]]++;
	            System.out.print(str2[i]);
	        }
	 
	       
	        if (str1.length != str2.length)
	            return false;
	 
	        // Compare count arrays
	        for (i = 0; i < NO_OF_CHARS; i++)
	            if (count1[i] != count2[i])
	                return false;
	 
	        return true;
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	        char str1[] =
	        ("triangle").toCharArray();
	        char str2[] =
	        ("integral").toCharArray();
	 
	        // Function call
	        if (areAnagram(str1, str2))
	            System.out.println(
	            "The two strings are" +
	            "anagram of each other");
	        else
	            System.out.println(
	            "The two strings are not" +
	            " anagram of each other");
	    }
	}