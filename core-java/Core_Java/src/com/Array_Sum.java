package com;

import java.util.Scanner;

public class Array_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number for array size= ");
		int n = s.nextInt();
		int sum = 0;
		int a[] = new int[n];
		System.out.println("Enter elements of array:");
		for (int i : a) {

			i = s.nextInt();

			sum = sum + i;
		}
		System.out.println("Sum of array elements is: " + sum);
		s.close();
	}

}
