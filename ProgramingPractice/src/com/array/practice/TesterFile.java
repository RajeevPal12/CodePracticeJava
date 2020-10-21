package com.array.practice;

public class TesterFile {

	public static void main(String[] args) {
		System.out.println("Start Tester !");
		ReadCmdValueSeparateBySpace read=new ReadCmdValueSeparateBySpace();
		SortIntArray obj=new SortIntArray();
		//int[] arr=obj.selectionSort(read.readIntArrFromCmd());
		//int[] arr=obj.insertionSort(read.readIntArrFromCmd());
		int[] arr = read.readIntArrFromCmd();
		obj.mergeSorting(arr);
		
		obj.printArray(arr);
		
		System.out.println("Read value to search !");
		int num=read.readIntFromCmd();
		BinarySearch sobj=new BinarySearch();
		int index=sobj.search(arr, num);
		System.out.println("found value at index :"+index);
		
		System.out.println("End Tester !");
	}

}
