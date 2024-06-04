package com.java.recursion;

public class RemovrDuplicates {
	public static boolean[] map=new boolean[26];
	
	public static void removeduplicates(String str,int idx,String newStr) {
		if(idx==str.length()) {
			System.out.println(newStr);
			return;
		}
		char currentChar = str.charAt(idx);
		if(map[currentChar-'a']==true) {  // ==true can be removed as it is by defult check for true
			removeduplicates(str, idx+1, newStr);
		}else {
			newStr += currentChar;
			map[currentChar-'a']=true;
			removeduplicates(str, idx+1, newStr);
		}
		
	}

	public static void main(String[] args) {
		String str="abbccdd";
		removeduplicates(str, 0, " ");
		

	}

}
