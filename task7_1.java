package com.assignment;
import java.security.KeyStore.Entry;
import java.util.*;

public class task7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    HashMap <Character,Integer> unique = new HashMap<>();
    String str = "i am learning java";
    
 
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
	
	
	for(java.util.Map.Entry<Character, Integer> entry: unique.entrySet())
    {
        if(entry.getValue() == 1)
        {
           System.out.println("first non repeating char is: "+ entry.getKey());
           	break;
         }		
}

}

}
