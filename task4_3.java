package com.assignment;
import java.util.Scanner;

public class task4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int arr [] = {11,3,2,4,15,8,16};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int n = sc.nextInt(); int flag =0;		 
		
		for (int i=0 ; i <= arr.length-1; i++)
		{
			if (arr[i] == n)
			{   flag =1;
				System.out.println("yes number is present");
		    	break;
			}
		}			 
   	   
		if(flag ==0)
			System.out.println("no number is not present");
}

}