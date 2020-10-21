package com.array.practice;

public class BinarySearch {

	public int  search(int[] arr , int num) {
	 int index=0;
		int n=arr.length;
		int start = 0;
		int end = n;
		int mid = (start+end)/2 ;
		
		while(mid>0 && mid<n) {
			if(arr[mid]==num) {
				System.out.println("Find value at index :"+mid);
				index=mid;
				break;
			}
			if(num<arr[mid]) {
				end=mid-1;
			}
			if(num > arr[mid]) {
				start=mid+1;
			}
			mid = (start+end)/2 ;
		}
		
		return index;
	}

}
