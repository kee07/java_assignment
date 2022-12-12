// Java program to
// find maximum in
// arr[] of size n
package com.assignment;
import java.util.*;

class task7_8
{
	
	// returns maximum in
	// Air[] of size n
	  int largest1(int []arr1, int n)
	{
		Arrays.sort(arr1);
		System.out.println (arr1[4]);
			return arr1[n - 1];
	}

	// Driver code
	 public static void main (String[] args)
	{
		int []arr1 = {10, 324, 45, 90, 9808};
		int n = arr1.length;
		task7_8 t1 = new task7_8();
		
		System.out.println(t1.largest1(arr1, n));
	}
}

