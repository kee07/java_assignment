package com.assignment;

import java.util.HashMap;

public class task7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    HashMap <Character,Integer> unique = new HashMap<>();
    String str = "java programming";
    
 
	int count =0;
	
	
	for(int i =0; i <str.length(); i++)
	{
		
		if(unique.containsKey(str.charAt(i)))
		{
			count= unique.get(str.charAt(i));
			unique.put(str.charAt(i),++count);
			
			
		}
		else
		 
		unique.put(str.charAt(i),1);
		
		
	}
	System.out.println(unique);
	
	}
}

	
