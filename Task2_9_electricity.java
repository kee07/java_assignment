package com.assignment;
import java.util.Scanner;

public class Task2_9_electricity {

	public static void main(String[] args) {

	float electricity_unit;
	double total=0;
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter used units");
	 electricity_unit = sc.nextFloat();
	 
	if (electricity_unit <= 60)
	{
	System.out.println("charges will be 0.30/unit");
	total = (electricity_unit * 0.30);
	}
	
	if (electricity_unit >60 && electricity_unit <=150)
	{
	System.out.println("charges will be 0.75/unit");
	total = (electricity_unit * 0.75);
	}
	
	if (electricity_unit >150 && electricity_unit <=270)
	{
	System.out.println("charges will be 1.10/unit");
	total = (electricity_unit * 1.10);
	}
	if (electricity_unit >300)
	{
	System.out.println("charges will be 2.50/unit");
	total = (electricity_unit * 2.50);
     }
	
	System.out.println("charges are " + total );
	
	System.out.println("total charges with surcharge of 20% " + (total+(total*0.20)));

}
}