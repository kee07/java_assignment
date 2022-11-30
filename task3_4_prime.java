package com.assignment;
import java.util.Scanner;

public class task3_4_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no");
	 n = sc.nextInt();
	
    int count = 2; int flag=0;
    
    if(n ==0||n==1){  
    	   System.out.println(n+ " is not prime number");
    }
    else	
    {
    
	while(count < n )
	{
		if(n % count == 0 )
		{
			flag=1;
			break;

	    }
		count = count +1;
	}		
  
    if(flag==0)
    {
 
    	System.out.println(n+ " is a prime number");  
    }
    else
    	System.out.println(n+ " is not a prime number"); 
   }
	}

}