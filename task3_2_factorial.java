package com.assignment;
import java.util.Scanner;



class factorial

{
	int number =1;
	int fact(int number) {
		
		int count = 1;
		while (count<= number)
		{
			this.number = this.number * count;
			count= count+1;		
		}
		
		return (this.number);
	}
			
}


public class task3_2_factorial {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for factorial");
		int a = sc.nextInt();
		
		factorial f1 = new factorial();
		System.out.println("factorial is "+ f1.fact(a));
		
	
	}

}
