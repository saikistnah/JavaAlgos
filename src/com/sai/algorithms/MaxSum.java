package com.sai.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSum {

	public static void main(String[] args) {
		  List<Integer> li = new ArrayList<>();
		   li.add(3);
		   li.add(8);
		   li.add(10);
		   li.add(3);
		   li.add(-1);
		   li.add(20);
		   
		   int len = li.size()-1;

		   Collections.sort(li);
		 
		  System.out.println("Max number : "+ (li.get(len)+li.get(len-1)));

	}

}
