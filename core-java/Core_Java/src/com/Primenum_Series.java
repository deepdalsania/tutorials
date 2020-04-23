package com;

import java.util.Scanner;

public class Primenum_Series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any positive number= ");
		int n = s.nextInt();
		s.close();
		int k = 0;
		System.out.println("Prime numbers up to " + n + " are : ");
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
				}
			}

			if (k == 1) {
				k = 0;
			} else {
				System.out.println(i);
			}
		}

	}
}
