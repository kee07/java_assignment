package com.assignment;
import java.util.Scanner;


class Palindrome
{
	int number ;
	int sum = 0;
	
	int palin(int number) {
		
		this.number= number %10;
		sum = (sum *this.number)+ this.number;
		
		
		return (this.number);
	}
			
}


public class task3_3_palindrome {


		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for palindrome");
		int a = sc.nextInt();
		
		Palindrome p1 = new Palindrome();
		System.out.println("Palindrome is "+ p1.palin(a));
		
	
	}

}
