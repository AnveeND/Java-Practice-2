package com.java.recursion;

public class FirstLastOccurence {
	public static int first=-1;
	public static int last =-1;
	
	public static void findOccurence(String str,int idx,char element) {
		
		if(idx==str.length()) {
			System.out.println(first +" "+ last);
			return;
		}
		
		char cc=str.charAt(idx);
		if(cc==element) {
			if(first==-1) {
				first=idx;
			}
			else {
				last=idx;
			}
		}
		findOccurence(str,idx+1,element);
	}

	public static void main(String[] args) {
		String str="abaacvthao";
		findOccurence(str, 0, 'a');
		

	}

}
