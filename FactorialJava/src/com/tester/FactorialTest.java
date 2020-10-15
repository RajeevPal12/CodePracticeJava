package com.tester;

import java.util.Scanner;

public class FactorialTest {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Factoril Project start");
		int num= Integer.valueOf(sc.nextLine());
		int numFact=getFactorial(num);
		System.out.println("Factoril of Num"+num +" is :"+numFact);

	}

	public static int getFactorial(int num) {
		if(num==1) return num;
		
		return num*getFactorial(num-1);
	}
}
