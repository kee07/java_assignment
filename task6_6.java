package com.assignment;
import java.util.Scanner;


class complex
{
 int real;
 int img;
	
    complex()
    {
    }
    
	complex(int real,int img)
	{
		this.real =real;
		this.img = img;
	}
	
	void print()
	{
		System.out.println("complex no is: " + real + "+ i" + img);
	}
	
	
	complex add(complex c1, complex c2){
        complex c = new complex();
        
		c.real = c1.real + c2.real;
		c.img= c1.img + c2.img;
		
		return c;
	}
	
	complex substract (complex c1, complex c2){
        complex c = new complex();
        
		c.real = c1.real - c2.real;
		c.img= c1.img - c2.img;
		
		return c;
	}
	
	
	complex product (complex c1, complex c2){
        complex c = new complex();
        
		c.real = (c1.real *c2.real)- (c1.img*c2.img);
		c.img= (c1.img * c2.real) + (c2.img * c1.real) ;
		
		return c;
	}
	
	
	}
	
public class task6_6 {

	
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
  		 Scanner sc = new Scanner(System.in);
  		 System.out.println("enter values for complex no");
  		 int a = sc.nextInt();
  		 int b =  sc.nextInt();
  		 
  		System.out.println("enter values for complex no");
		complex c1 = new complex(a,b);
	   
	     
	     int c = sc.nextInt();
  		 int d =  sc.nextInt();
	     complex c2 = new complex(c,d);
	     c1.print(); 
	     c2.print();
	     
	     System.out.println("sum");
	     complex c3 = new complex();
	     c3 = c3.add(c1,c2);
	     c3.print();
	
	     System.out.println("minus");
	     complex c4 = new complex();
	     c4 = c4.substract(c1,c2);
	     c4.print();
	     
	     System.out.println("prouct");
	     complex c5 = new complex();
	     c5 = c5.product(c1,c2);
	     c5.print();
	}

}
