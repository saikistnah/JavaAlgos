package com.sai.algorithms;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		System.out.println("Enter the String : ");
		Scanner s1 = new Scanner(System.in);
		String original = s1.nextLine();
		char[] rev = original.toCharArray();
		int length = original.length()/2;
		int i=0;
		int j=original.length()-1;
		char temp = ' ';
		while(i<length){
			temp = rev[i];
			rev[i] = rev[j];
			rev[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(rev);
	}

}
