package com.java.sorting;

public class InsertionSort {
	
	//dividing array into two parts sorted and unsorted
	//take element from unsorted part and put it into its right position in sorted part
	
	
	

	public static void main(String[] args) {
		int arr[]= {8,6,9,45,88,6,1,0};
		
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;    // used to track sorted part
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			
			//place element in sorted array
			arr[j+1]=current;
			
		}
		
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
