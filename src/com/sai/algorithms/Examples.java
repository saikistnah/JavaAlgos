package com.sai.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Examples {
	
	 public static int magic(List<Integer> stones) {
	        
	     List<Integer> li = new ArrayList<>();
		 Collections.sort(stones);
		 int add = 0;
		 int count =0;
		 
		 for(int i=0;i<stones.size()-1;i++){
			 if(stones.get(i)==stones.get(i+1) || add== stones.get(i)){
				 count=1;
				 add += stones.get(i)*2;
			 }
		 }
		return add;
	        
	    }

	public static void main(String[] args) {
		List<Integer> stones = new ArrayList<> (Arrays.asList(1,2,1));
		System.out.println(Examples.magic(stones)); // 1

		stones = new ArrayList<> (Arrays.asList(1, 1, 5));
		System.out.println(Examples.magic(stones)); // 2

		stones = new ArrayList<> (Arrays.asList(1, 1, 2, 3, 3, 2));
		System.out.println(Examples.magic(stones)); 

	}

}
