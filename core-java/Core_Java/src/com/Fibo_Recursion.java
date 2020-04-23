package com;

import java.util.Scanner;

public class Fibo_Recursion {

	/**
	 * @param args
	 */

	static int fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return (fibo(n - 1) + fibo(n - 2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any positive number= ");
		int n = s.nextInt();
		s.close();
		System.out.println("Fibonacci series is: ");
		for (int i = 0; i <= n; i++) {
			System.out.println(fibo(i));
		}
	}

}
