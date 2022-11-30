//check an alphabet

package com.assignment;
import java.util.Scanner;

public class task2_2 {
 		
	      
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the character ");
			char a = sc.next().charAt(0);
			
			if(( a >= 'a'  && a <='z') || (a >= 'A' && a <= 'Z'))
				System.out.println(a + " is an alphabet.");
			else
				System.out.println(a + " is not an alphabet.");
}

}