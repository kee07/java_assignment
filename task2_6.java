package com.assignment;
import java.util.Scanner;


public class task2_6 {
	public static void main(String[] args) {
	
	double result,number1,number2;
	char operator;
	
	
	Scanner sc = new Scanner (System.in);
	System.out.println("please enter operaotor of your choice  : +, - ,*, / ");
	operator = sc.next().charAt(0);
	System.out.println("please enter first number ");
	 number1 = sc.nextDouble();
	
	System.out.println("please enter second number ");
	 number2 = sc.nextDouble();
	
	switch(operator) {
	
	
	case '+': 
			  result = number1 + number2;
			  System.out.println("result is : " + result);
	          break;

	case '-': result = number1 - number2;
	          System.out.println("result is : " + result);
              break;
		
	case '*': result = number1 * number2;
	          System.out.println("result is : " + result);
	          break;
		
	case '/': result = number1 / number2;
	          System.out.println("result is : " + result);
              break;	
	default:
		System.out.println("invalid operator");
        break;
		
	
	}
}
}