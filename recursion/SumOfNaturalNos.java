package com.java.recursion;

public class SumOfNaturalNos {
	
	public static void sumno(int i,int n,int sum) {
		
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return;
			
		}
		sum=sum+i;
		sumno(i+1, n, sum);
	}
		

	public static void main(String[] args) {
		
		sumno(1,4,0);
		

	}

}
