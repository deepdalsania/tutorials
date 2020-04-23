package com;

import java.util.Scanner;

public class Even_Odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("i = ");
		int i = s.nextInt();
		s.close();
		if (i % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}
	}

}
