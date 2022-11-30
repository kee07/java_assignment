package com.assignment;
import java.util.Scanner;

public class task1_4 {
	int a;
	int b;
	
	int sum(int a,int b){
		this.a=a;
		this.b=b;
		
		return (this.a + this.b);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter 2 values "
      		+ " ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      task1_4 t = new task1_4();
      System.out.println("sum is : " + t.sum(a,b));
		
	}

}
