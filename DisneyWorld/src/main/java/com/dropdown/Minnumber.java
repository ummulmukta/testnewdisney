package com.dropdown;

public class Minnumber {

	public static void main(String[] args) {
		int min=100000;
		int[]m= {34,56,98,66};
		for(int i=0;i<m.length;i++) {
			if(m[i]<min) {
				min=m[i];
			}
		}
System.out.print(min);
	}

}
