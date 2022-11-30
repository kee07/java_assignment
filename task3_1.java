package com.assignment;
import java.util.Scanner;

public class task3_1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int  arr[];
			arr =  new int[10];
			arr[0]= 0;
			arr[1] = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hw many numbers you want to print in fibbonaccoi series");
		
		int sc1 = sc.nextInt();
    
		for (int i=0; i<=sc1; i++){
			
		arr[i+2] = arr[i]+arr[i+1];
		System.out.println( arr[i]);//printing 0 and 1    
		}
		

}

}