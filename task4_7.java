package com.assignment;

public class task4_7 {

	
public static int removeduplicates(int a[], int n)
{
    if (n == 0 || n == 1) {
        return n;
    }

    // creating another array for only storing
    // the unique elements
    int[] temp = new int[n];
    int j = 0;

    for (int i = 0; i < n - 1; i++) {
        if (a[i] != a[i + 1]) {
            temp[j++] = a[i];
            
        }
    }

    temp[j++] = a[n - 1];

    // Changing the original array
    for (int i = 0; i < temp.length; i++) {
    	if(i<j)
    	{
           a[i] = temp[i];
           
    	}
    	else
    		a[i] = 0;
    	
    }

    return j;
}
	
public static void main(String[] args)
{
    int a[] = {2,2,3,3,4,4,4,11,11,11,11};
    int n = a.length;

    n = removeduplicates(a, n);

    // Printing The array elements
    for (int i = 0; i < a.length; i++)
    	if(i<n)
        System.out.print(a[i] + " ");
    	else
    	System.out.print(a[i] + " ");
    		
    
}
}