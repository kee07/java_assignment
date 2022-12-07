package com.assignment;


class Triangle
{
	int a=3;
	int b=4;
	int c =5;
	
	int perimeter ()
	{
		int p = a +b +c ;
		
		return p;
	}
	
}	

public class task6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle t = new Triangle();
	
		System.out.println("perimeter is " + t.perimeter());
	}

}
