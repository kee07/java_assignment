package com.assignment;
import java.util.*;

	public class task4_6
	{
	        public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
	        
	        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        result.add(0);
	        result.add(1);
	        System.out.println(my_map);
	        System.out.println(result);
	        for(int i = 0; i < a.size(); i++){
	            if(my_map.containsKey(a.get(i))){
	                int index = my_map.get(a.get(i));
	                result.set(0, index );
	                result.set(1, i );
	               
	                break;
	            }
	            else{
	                my_map.put(b - a.get(i), i);
	                System.out.println("this is hash" + my_map);
	            }
	        }
	        
	        return result;
	    }
	  
	    public static void main(String[] args){
	        ArrayList<Integer> my_array = new ArrayList<Integer>();
	        my_array.add(1);
	        my_array.add(2);
	        my_array.add(4);
	        my_array.add(5);
			my_array.add(6);
			int target = 6;
			System.out.println(my_array);
	        ArrayList<Integer> result = two_sum_array_target(my_array, target);
	        System.out.println(result);
	        for(int i : result)
	            System.out.print("Index: "+i + " ");
	    }
	}