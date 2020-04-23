package com;

import java.util.Scanner;

public class Fibonacci_Series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any positive number= ");
		int n = s.nextInt();
		s.close();
		int a = 0, b = 1;
		System.out.println("Fibonacci series is : ");
		System.out.println(a + "\n" + b);
		for (int i = 0; i < n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
			System.out.println(temp);

		}

	}

}
