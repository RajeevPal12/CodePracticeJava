package com.array.practice;

import java.util.Arrays;

public class SortIntArray {

	public int[] selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) min=j;
			}
			swap(arr, i, min);
		}
		return arr;
	}
	public void swap(int[] arr , int i , int j) {
		int num=arr[i];
		arr[i]=arr[j];
		arr[j]=num;
	}
	
	public void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	public int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i < n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	
	public int[] insertionSort(int[] arr) {
		
		int n=arr.length;
		for(int i=1;i<n-1;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && key <arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	public int[] mergeSorting(int[] arr) {
		int n=arr.length;
		int start=0;
		int end=n-1;
		mergesSort(arr, start, end);
		return arr;
	}
	
	public int[] mergesSort(int[] arr , int start , int end) {
		
		if(start<end) {
			int mid=(start+end)/2;
			mergesSort(arr, start, mid);
			mergesSort(arr, mid+1, end);
			merge(arr,start, mid, mid+1, end);
			
		}
		return arr;
	}
	
	public void copyToArr(int[] temp, int[] arr ,int start , int end) {
		for(int i=start;i<end;i++) {
			arr[i]=temp[i];
		}
	}
	public void merge(int[] arr , int fstart,int fend , int sStart , int sEnd) {
		int i=fstart; int il=fend; int j=sStart; int jl=sEnd;
		int k=fstart;
		
		while(i<=il && j<=jl) {
			if(arr[i]<arr[j]) {
				arr[k++]=arr[i++];
			}else {
				arr[k++]=arr[j++];
			}
		}
		while(i<il) {
			arr[k++]=arr[i++];
		}
		while(j<jl) {
			arr[k++]=arr[j++];
		}
	}
	
	public int[] mergeSortRecursive(int[] arr) {
		
		return null;
	}
	
	public int[] quickSort(int[] arr) {
		
		return null;
	}
	public int[] iterativeQuickSort(int[] arr) {
		
		return null;
	}
	public int[] heapSort(int[] arr) {
		
		return null;
	}
	
	public int[] countSort(int[] arr) {
		
		return null;
	}
	public int[] redixSort(int[] arr) {
		
		return null;
	}
	
	public int[] treeSort(int[] arr) {
		
		return null;
	}
	

}
