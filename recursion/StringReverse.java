package com.java.recursion;

public class StringReverse {
	//Time complexity = O(n) 
	
	public static void printrev(String s,int idx) {
		if(idx==0) {
			System.out.print(s.charAt(idx));
			return;
		}
		System.out.print(s.charAt(idx));
		printrev(s, idx-1);
	}

	public static void main(String[] args) {
		
		String str="Hii Hello ";
		printrev(str,str.length()-1);

	}

}
