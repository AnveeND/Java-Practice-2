package com.java.recursion;

public class Fibonacci {
	static int n1=0;
	static int n2=1;
	
	public static void iterativefibonacci(int n) {
		
		int i=0;
		
		while(i!=n) {
			int x=n1;
			n1=n2;
			n2=n2+x;
			System.out.println(n2);
			i++;
			
			/*
			 ~~ Another possible way : 
			 
			 int n3=n1+n2;
			 System.out.println(n3);
			 n1=n2;
			 n2=n3;
			 
			 */
			
			
		}
		
	}
	
	
	public static void recursivef(int n,int n11,int n22) {
		
		if(n==0) {
			return;
		}
		int n33=n11+n22;
		System.out.println(n33);
		recursivef(n-1, n22, n33);
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(0);
		System.out.println(1);
		iterativefibonacci(8-2);// 8-2 because two terms already printed
		
		
		System.out.println("\n\n");
		
		System.out.println(0);
		System.out.println(1);
		recursivef(8-2, 0, 1);

	}

}
