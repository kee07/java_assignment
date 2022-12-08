package com.assignment;

public class task7_4 {

	public static void main(String[] args) {
		 
		        String sentence = "keep trying and work hard ";  
		        int wordCount = 0;  
		          
		        for(int i = 0; i < sentence.length()-1 ; i++) {  
		        	
		            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
		                wordCount++;  
		                System.out.println(wordCount);
		            }  
		        }  
		        wordCount++;  
		        System.out.println("Total number of words in the given string: " + wordCount);  
		    }  
		}  
		


