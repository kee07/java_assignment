package com.assignment;

class Student 
{
	String name = " ";
	int enroll;
    
	Student(String name, int enroll)
	{
		this.name = name;
		this.enroll = 132;
		
	}
	
}



public class task6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student ("Amay",132);
		System.out.println("name is "+ s1.name +" " + "enroll is "  + s1.enroll);
		

	}

}
