package com.assignment;
import java.util.Scanner;

public class task_4_2 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	 int arr[] =new int[4];
	 int sum=0;
	 float avg=0;
	 
 
	 for(int i=0;i<arr.length; i++)
	    {
		System.out.println("enter the numbers");
		 arr[i] = sc.nextInt(); 
	    }
		
		for (int element:arr)
		{
			sum = sum + element;
		}
	  System.out.println(sum);
      avg = (sum/4);
      System.out.println(avg);
}
}