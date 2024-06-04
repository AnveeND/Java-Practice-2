package com.java.sorting;

public class BubbleSort {
	
	
	
	
	/*
	 
	 - take the largest element and place it at last 
	 - compares neighbouring elements 
	 - n-1 comparisons 
	 - Time complexity = O(n^2)
	 
	 
	 
	 
	 
	 */

	public static void main(String[] args) {
		
		int[] arr= {6,7,4,9,2,0};
		
		
		
		//bubble sorting 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		
		}
		
		//print array 
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
