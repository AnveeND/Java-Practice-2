package com.java.recursion;

public class TowerOfHanoi {
	/*
	 Time complexity :- O(2^n)
	 
	 */
	
	public static void th(int n,String src,String helper,String dest) {
		
		if(n==1) {
			System.out.println(n+" Transfer From "+src+" to "+dest);
			return;
			
		}
		
		
		th(n-1, src, dest, helper);
		System.out.println(n+" Transfer From "+src+" to "+dest);
		th(n-1, helper, src, dest);
	}

	public static void main(String[] args) {
		
		th(5,"Source","Helper","Destination");
		

	}

}
