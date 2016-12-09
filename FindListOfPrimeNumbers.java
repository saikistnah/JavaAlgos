/**
 * 
 */
package com.sai.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author user
 *
 */
public class FindListOfPrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the List Of numbers and type 'O' after numbers");
		Scanner s1 = new Scanner(System.in);
		List<Integer> l1 = new ArrayList<>();
		FindListOfPrimeNumbers flpn = new FindListOfPrimeNumbers();
		while(s1.hasNextInt()){
			int number = s1.nextInt();
			if(flpn.findPrimeNumber(number))
			l1.add(number);
		}
		System.out.println("Prime Numbers : "+l1.size());
		System.out.println("List of Prime Numbers : ");
		for(int i=0;i<l1.size();i++){
			System.out.println(l1.get(i));
		}
		

	}
	
	public boolean findPrimeNumber(int number){
		int flagnumber = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				flagnumber = flagnumber + 1;
			}
		}

		if (flagnumber == 1) {
			return true;
		} else {
			return false;
		}
	}

}
