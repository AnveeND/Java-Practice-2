package com.java.recursion;

public class XraisedToN {
	
	public static int calcXn(int x,int n) {
		if(n==0) {  // base case 1
			
			return 1;
		}
		
		if(x==0) {  // base case 2
			return 0;
		}
		
		
		int x1=calcXn(x, n-1);
		
		x=x*x1;
		return x;
		
		/*
		 ~ Base cases as it is then ,
		
		 if(n%2==0){        //x is even
		 
		 	return calcXn(x, n/2)*calcXn(x, n/2);
		 }
		 
		 else {           //x is odd
		 
			 return calcXn(x, n/2)*calcXn(x, n/2)*x;
		 }
		 
		  */
		 
		 
		
		
	}

	public static void main(String[] args) {
		int xn=calcXn(3,3);
		System.out.println(xn);
		

	}

}
