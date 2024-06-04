package com.java.sorting;

public class SelectionSort {
	
	//find smallest element and put it in front
	//one swap per iteration 
   // Time complexity = O(n^2) 

	public static void main(String[] args) {
		int arr[]= {9,7,0,12,3,6,1};
		
		//select smallest element 
		for(int i=0;i<arr.length;i++) {
			
			int smallest=i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
				
			}
			
			//after finding smallest element swap it with first unsorted element
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			
		}
		
		//print array
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}

