package com.assignment;

public class tash4_4_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{1,2,2},{3,4,1}};
		int b [][] ={{1,1,3},{3,2,2},{1,4,2}};
		int c[][] = new int[3][3];
		
		System.out.println("First matrix a ");
		
		for(int arr[] :a) {
			for(int element : arr)
			{
			System.out.print(element+ " ");
		    }
		System.out.println(); 
		}
		
		System.out.println("Second matrix b ");
		
		
		for(int arr[] :b) {
			for(int element : arr)
			{
			System.out.print(element+ " ");
		    }
		System.out.println(); 
		}
		
		System.out.println("sum matrix ");
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			c[i][j]+= a[i][j]*b[k][j];      
			}//end of k loop  
			System.out.print(c[i][j]+" ");    
			} 
			System.out.println();   
			}    
			}


}
