package com.sai.algorithms;

public class QuickSort {
	int number=0;
	int[] numbers;
	
	public void sort(int[] arr){
		this.numbers=arr;
		this.number=arr.length;
		quickSort(0,this.number-1);
	}
	
	public void quickSort(int low,int high){
		
		int pivot = this.numbers[low+(high-low)/2];
		int i=low;
		int j=high;
		
		while(i<=j){
			while(this.numbers[i]<pivot){
				i++;
			}
			while(this.numbers[j]>pivot){
				j--;
			}
			if(i<=j){
				int temp=this.numbers[i];
				this.numbers[i]=this.numbers[j];
				this.numbers[j]=temp;
				i++;
				j--;
			}
			
		}
		
		if(low<j)
			quickSort(low,j);
		if(i<high)
			quickSort(i,high);
	}

	public static void main(String[] args) {

		int arr[] = new int[]{5,3,6,8,10,1,4,2,3,12,14,18,20,24};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr);
		for(int i:arr)
			System.out.println(i);
	}

}
