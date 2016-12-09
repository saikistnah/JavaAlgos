package com.sai.algorithms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner s1 = new Scanner(System.in);
		int original = s1.nextInt();
		int ans =0;
		int temp = 1;
		int prev = 0;
		System.out.println("Fibonacci series : ");
		while(ans<original){
			ans = temp + prev;
			prev = temp;
			temp = ans;
			System.out.println(ans);
		}
	}

}
