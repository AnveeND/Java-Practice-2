package com.java.recursion;

public class SubsequencesOfString {
	//SUBSEQUENCES : small parts of string but following order of letters in main String
	
	public static void subsequences(String str,int i,String newStr) {
		if(i==str.length()) {
			System.out.println(newStr);
			return;
			
		}
		char currChar=str.charAt(i);
		
		//to be 
		subsequences(str, i+1, newStr+currChar);
		
		//not to be 
		subsequences(str, i+1, newStr);
	}

	public static void main(String[] args) {
		
		String string = "abc";
		subsequences(string, 0, " ");
		
		//no of subsequences of string is 2 to the power length.
		

	}

}
