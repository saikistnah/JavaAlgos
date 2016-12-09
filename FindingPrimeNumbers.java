/**
 * 
 */
package com.sai.algorithms;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class FindingPrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();
		int flagnumber = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				flagnumber = flagnumber + 1;
			}
		}

		if (flagnumber == 1) {
			System.out.println("is a prime number");
		} else {
			System.out.println("Not a prime");
		}
	}

}
