package com.array.practice;

import java.util.Scanner;

public class ReadCmdValueSeparateBySpace {
	public static final Scanner sc = new Scanner(System.in);
	public int[] readIntArrFromCmd() {
		String str= sc.nextLine();
		String[] stArr=str.split(" ");
		int[] arr=new int[stArr.length];
		for(int i=0;i<stArr.length;i++) {
			arr[i]=Integer.valueOf(stArr[i]);
		}
		return arr;
	}
	
	public String[] readStringArrFromCmd() {
		String str= sc.nextLine();
		String[] stArr=str.split(" ");
		return stArr;
	}
	public Integer readIntFromCmd() {
		String str= sc.nextLine();
		return Integer.valueOf(str);
	}
}
