package com.assignment;

class Employee
{
	String name;
	int joining_year;
	String address;
	
	Employee(String name,int joining_year,String address)
	{
		this.name = name;
		this.joining_year= joining_year;
		this.address = address;
		
	}

	void printdetails() {
		System.out.println(name + " " + joining_year + address);
		
				
		
	}
	
	
}



public class task6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	System.out.println("Name  Joining_year    Adress");
	
	Employee e1 = new Employee("Robert ",1994, "     64C- Walls Street");
	e1.printdetails();
	
	Employee e2 = new Employee("Sam   ",2000, "     68D- Walls Street");
	e2.printdetails();
	
	Employee e3 = new Employee("John  ",1999, "      28C Walls Street");
	e3.printdetails();	
		
		
	}

}
