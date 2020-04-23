package com;

import java.util.Scanner;

public class Fact_Recursion {

	/**
	 * @param args
	 */
	static long fact(long i) {
		if (i == 0) {
			return 1;

		} else if (i == 1) {
			return 1;
		} else {
			return (i * fact(i - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any positive number= ");
		long n = s.nextLong();
		s.close();
		long f;
		f = fact(n);
		System.out.println("Fctorial of " + n + " = " + f);
	}

}
