package com.dropdown;

public class Maxnumber {

	public static void main(String[] args) {
		int max=0;
		int[]m= {5,8,9,7};
		int l=m.length;
		for(int i=0;i<l;i++) {
			if(m[i]>max)
				max=m[i];
		}
System.out.println(max);
	}

}
