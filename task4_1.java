package com.assignment;
import java.util.Scanner;
import java.util.Arrays;

public class task4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner sc = new Scanner(System.in);
		 
		 int arr[] = new int[2];
		 
		 for(int i=0;i<arr.length; i++)
		    {
			System.out.println("enter the numbers");
		    int a = sc.nextInt(); 
		    arr[i] = a;
		    }
	
		 //print array in array style
			System.out.println(Arrays.toString(arr));
        
			//print array with foreach loop
			
			for (int element:arr)
			{
			System.out.println(element);	
			}

	}

}