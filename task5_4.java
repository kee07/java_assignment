package com.assignment;
import java.util.HashMap;

public class task5_4 {

  
	
	public static void main(String[] args)
    {
        String str = "google";
        
        HashMap <Character,Integer> occur = new HashMap <>();
      
        
        for(int i=0; i<str.length(); i++)
        {
        	if(occur.containsKey(str.charAt(i)))
        	{
        		int count = occur.get(str.charAt(i));  
        		occur.put(str.charAt(i),++count);
        		
        	}
        	else
        	occur.put(str.charAt(i), 1);	
        	
        }
        
        System.out.println(occur);     
		
    }
	
}
