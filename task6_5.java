package com.assignment;


class Rectangle
{
	int length;
	int breadth;
	
	Rectangle()
	{
		this.length = 0;
		this.breadth = 0;
		int a = area(this.length,this.breadth);	
		System.out.println(a);
	}
	
	Rectangle (int a, int b)
	{
		this.length =  a;
		this.breadth = b;
		int c = area(this.length,this.breadth);	
		System.out.println(c);
	}
		
	Rectangle (int a)
	{
		this.length =  a;
		this.breadth = a;
		int c = area(this.length,this.breadth);	
		System.out.println(c);
	}
	
	int area(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		int area = this.length * this.breadth;
		return area;
		
	}
	

	
	
}

public class task6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4,5);
		Rectangle r3 = new Rectangle(4);
		
	}

}
