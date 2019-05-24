/**
 * 
 */
package com.sai.algorithms;

import java.util.Arrays;

/**
 * @author NEETHU
 *
 */
public class BinarySearch {
	
  static boolean exists(int[] ints, int k) {
	  int mid =0;
	  if(ints.length>=1){
		  mid=ints[ints.length/2];
	  
		int centr = ints.length/2;
		
		if(k<mid){
		   ints=Arrays.copyOfRange(ints,0,mid);
		}else if(k>mid){
		    
		   ints=Arrays.copyOfRange(ints,centr+1,ints.length);
		}else{
		    return true;
		}
		
		return exists(ints,k);
	  }
	  return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ints = {-9, 14, 37, 102};
		System.out.println(BinarySearch.exists(ints, 102)); // true
		System.out.println(BinarySearch.exists(ints, 36));

	}

}
