package com.sai.algorithms;

import java.util.Scanner;

public class RevPascualTriangle {

	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		Scanner s1 = new Scanner(System.in);
		int original = s1.nextInt();
		int i = original;
		int ln = 0;
		
		while(i>0){//O(n)=n;
			for(int j=ln;j>0;j--){//n!
				System.out.print(" ");
			}
			
			for(int k=i;k>0;k--){//n!
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println("");
			ln++;
			i--;
			
		}

	}//n+n!+n!

}
