package com.dropdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteDuplicateArray {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,89,89,67,67,56));
		List<Integer>newlist=list.stream().distinct().collect(Collectors.toList());
		//ArrayList<Integer>newlist=new ArrayList<>(Arrays.re)
System.out.println(newlist);


	}

	

}
