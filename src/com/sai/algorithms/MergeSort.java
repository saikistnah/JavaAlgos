package com.sai.algorithms;

public class MergeSort {
	int[] helper ;
	int number = 0;
	int[] numbers;
	
	public void sort(int[] arr){
		this.numbers=arr;
		number = arr.length;
		this.helper = new int[number];
		mergeSort(0,number-1);
	}
	
	public void mergeSort(int low,int high){
		if(low<high){
			int middle = low+ (high-low)/2;
			mergeSort(low,middle);
			mergeSort(middle+1,high);
			merge(high,middle,low);
		}
				
	}
	
	public void merge(int high,int middle,int low){
		
		for(int i=low;i<=high;i++)
			this.helper[i]=this.numbers[i];
		
		int i=low;
		int j=middle+1;
		int k =low;
		
		while(i<=middle&&j<=high){
			if(this.helper[i]<=this.helper[j]){
				this.numbers[k]=this.helper[i];
				i++;
			}else{
				this.numbers[k]=this.helper[j];
				j++;
			}
			k++;
			
		}
		
		while(i<=middle){
			this.numbers[k]=this.helper[i];
			i++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = new int[]{5,3,6,8,10,1,4,2,3,12,14,18,20,24};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);
		for(int i:arr)
			System.out.println(i);

	}

}
