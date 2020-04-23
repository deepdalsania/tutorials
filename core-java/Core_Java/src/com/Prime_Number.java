package com;

import java.util.Scanner;

public class Prime_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any positive number =");
		int n = s.nextInt();
		s.close();
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println(n + " is Prime number");
		} else {
			System.out.println(n + " isnot Prime number");
		}
	}

}
