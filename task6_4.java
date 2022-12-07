package com.assignment;



class Student_name
{
	String name;
	
	Student_name()
	{
		this.name = "unknown";
	}
	
	Student_name(String name)
	{
		this.name = name;
		
	}
		
}


public class task6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Student_name s1= new Student_name();
	 Student_name s2 = new Student_name("kiran");
	 Student_name s3 = new Student_name("Mishika");
	 
	 System.out.println(s1.name);
	 System.out.println(s2.name);
	 System.out.println(s3.name);
		
	}

}
