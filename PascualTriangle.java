package com.sai.algorithms;

import java.util.Scanner;

public class PascualTriangle {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner s1 = new Scanner(System.in);
		int original = s1.nextInt();
		int i = 0;
		int ln = original;

		while (i < original) {
			for (int j = ln; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println("");
			i++;
			ln--;

		}

	}

}
