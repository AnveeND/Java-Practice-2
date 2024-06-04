package com.java.recursion;

public class SortedArray {
	
	public static boolean isSorted(int idx,int ary[]) {
		if(idx==ary.length-1) {
			return true;
			
		}
		if(ary[idx]<ary[idx+1]) {
			return isSorted(idx+1, ary);
		}else {
			return false;
			
		}
	
			
		
		
	}

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,10};
		boolean output=isSorted(0, array);
		System.out.println(output);

	}

}
