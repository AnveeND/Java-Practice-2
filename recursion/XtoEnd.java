package com.java.recursion;

public class XtoEnd {
	public static int count=0;
	public static String newstr ="";
	
	public static void toEnd(String str,int i,char ele) {
		if(i==str.length()-1) {
			for(int j=0;j<count;j++) {
				newstr=newstr+ele;
			}
			System.out.println(newstr);
			return;
		}
		if(str.charAt(i) == ele) {
			count ++;
		}
		else {
			newstr=newstr+str.charAt(i);
		}
		toEnd(str, i+1, ele);
	}
	

	public static void main(String[] args) {
		
		String s="axbcxxd";
		toEnd(s, 0, 'x');
		

	}

}
