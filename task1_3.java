package com.assignment;
import java.util.Scanner;

class withoutthird_variable {

	int a;
	int b;
	
	public withoutthird_variable(int a, int b) {
		// TODO Auto-generated constructor stub
   		
		this.a=b;
		this.b=a;
	  }
	 
}


class withthird_variable {

	int a;
	int b;
	
	public withthird_variable(int a, int b) {
		// TODO Auto-generated constructor stub
   		int c;
   		
   		c= a;
		this.a=b;
		this.b=c;
	  }
	 
}




public class task1_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		withoutthird_variable w1 = new withoutthird_variable(a,b);
		
		System.out.println("swap the number without third variable : " +w1.a + " and " + w1.b);
				
		withthird_variable w2 = new withthird_variable(a,b);
		System.out.println("swap the number with third variable : " +w2.a + " and " + w2.b);
	}
	

}
