package com.assignment;
import java.util.*;

public class task4_9 
{
	
	public static ArrayList<Integer> addition (final List<Integer> my_array, int target) {
		// TODO Auto-generated method stub
		   ArrayList <Integer> result =  new ArrayList<Integer> ();
		   ArrayList <Integer> temp =  new ArrayList<Integer> ();
		  
		   result.add(0);
		   result.add(1);
		   
		   for(int i=0; i < my_array.size(); i++)
		   { 
			   if(temp.contains(my_array.get(i)))
			   {
				 int index = my_array.indexOf(my_array.get(i)); 
			     result.set(0,index) ;
			     result.set(1, i);
			     break;
			   }
			   
			   else{
				   temp.add(target - my_array.get(i));
	             
	            }
	        }
			   
			   	return result; 
			   		  		 	
		   
	}
	
	
	 public static void main(String[] args){
	        ArrayList<Integer> my_array = new ArrayList<Integer>(5);
	        my_array.add(1);
	        my_array.add(4);
	        my_array.add(10);
	        my_array.add(-3);
	        int target = 14;	
	        
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        
	        		result = addition(my_array, target);
	        
	       for(int i : result)
	            System.out.print("Index: "+ result.get(i));
	    }
			
	 	
	   
	    }


