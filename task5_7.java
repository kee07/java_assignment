package com.assignment;
import java.util.*;
import java.util.Scanner;

public class task5_7 {

	

	    static void check_isogram (String str, HashMap<Character,Integer> occur)
		{
		int count =0;
		
		
		for(int i=0 ; i <str.length();i++)
		{
		     if(occur.containsKey(str.charAt(i)))
		     {
		    	 
		    	 count = occur.get(str.charAt(i));
		    	 occur.put(str.charAt(i),++count);
		    	 if(count>1)
		    		 System.out.println("not isogram ");
		    	 
		     }
		     else
			occur.put(str.charAt(i),1);
			//System.out.println(occur);
			
		}
	      
	}
	    
	    
	   private static String reverse(String [] str)
	    {
	           String str1 = new String();
	           
	    		for(int i =0; i<=str.length-1; i++)
	    		{
	    		 str1 = str[i]+ " ";  	
	    		 for(int j=str1.length()-1; j>=0;j--) 
	    		 {
	    			System.out.print(str1.charAt(j));

	    		 }
	    	
	    	}
	    		return null;
	    }
	    	
	    	
	 
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	     
	       Scanner sc = new Scanner(System.in);
		   System.out.println("enter string");
		   String message = sc.next();
			
			//System.out.println("* is" + message);
			 HashMap <Character, Integer> occur = new HashMap <Character, Integer>();
			check_isogram(message,occur);
		    
			String str1[ ]= "hi keep going".split(" ");
			reverse(str1);
			
		}


}	
		
  
