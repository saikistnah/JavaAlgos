package com.sai.algorithms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the String : ");
		Scanner s1 = new Scanner(System.in);
		String original = s1.nextLine();
		char[] rev = original.toCharArray();
		int length = original.length()/2;
		int i=0;
		int j=original.length()-1;
		boolean temp = true;
			while(i<length){
				if(rev[i] == rev[j] && temp){
					temp = true;
				}else{
					temp = false;
				}
				i++;
				j--;
			}
		if(temp){
			System.out.println(original +" : is a pascal number ");
		}else{
			System.out.println(original +" : is not a pascal number ");
		}
		
		
	}

}
