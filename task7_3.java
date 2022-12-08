package com.assignment;
import java.util.*;

public class task7_3 {

		static boolean uniqueCharacters(String str)
		{
			HashSet<Character> char_set = new HashSet<>();

			for(int c = 0; c< str.length();c++)
			{
				char_set.add(str.charAt(c));
			}

			
			return char_set.size() == str.length();
		}

		
		public static void main(String[] args)
		{
			String str = "kiran";

			if (uniqueCharacters(str))
			{
				System.out.println("The String : " + str + " has all unique characters");
			}
			else
			{
				System.out.println("The String : " + str + " has duplicate characters");
			}
		}
		}


