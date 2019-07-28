package com.dropdown;

 
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		/*
		 * int[] x= {1,2,3,4,5,6,7,8};
		 * 
		 * int temp; for(int i=0;i<x.length/2;i++){ temp=x[i]; x[i]=x[x.length-1-i];
		 * x[x.length-1-i]=temp; } System.out.print(Arrays.toString(x));
		 */
		
		/*
String a=new String("UmmulOara")
*/
		StringBuffer a=new StringBuffer("MMM");
		String b=a.reverse().toString();
		//System.out.println(b);
		if(a.equals(b)) {
			System.out.println("this is palindrome");
			
		}
		/*
		 * else { System.out.println("not"); }
		 */
	}

	
}
