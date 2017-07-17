package com.sai.algorithms;

import java.util.Scanner;

public class ZigZagAlgo {

	public static void main(String[] args) {
		System.out.println("Enter number of rows : ");
		Scanner s1 = new Scanner(System.in);
		int n=s1.nextInt();
		System.out.println("Enter number of columns : ");
		Scanner s2 = new Scanner(System.in);
		int c = s2.nextInt();
		int t=n*c;
		int h = t/(2*n);
		int tempval=n;
		
		int num =0;
		int l=1;
		int k=0;
		while(num<h){//O(n)=n/2
			
			for(int i=l;i<tempval+1;i++){//O(n)=n;
				System.out.print(" "+i);
				k=i;
			}
			System.out.println("");
			for(int j=k+n;j>tempval;j--){//O(n)=n;
				l=j;
				System.out.print(" "+j);
			}
			System.out.println("");
			l=l+n;
			tempval=l+n-1;
			num++;
		}
	}

}
