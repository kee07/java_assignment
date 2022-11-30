package com.assignment;
import java.util.Scanner;

public class task3_5_sumeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {2,3,4,5,6,7};
		 
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter no");
		//int numbers = sc.nextInt();
        
		 int count =0;
         int sum =0;
         
		while(count <= arr.length-1)
		{
			if(arr[count] %2 ==0 )
			{
			 sum = sum + arr[count];
			 count = count+1;
			}
			else
				count = count+1;
			
		}
		 
		 System.out.println("sum of even no is: " + sum);
	
		 
	}

}
