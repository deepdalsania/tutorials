package com;

import java.util.Scanner;

public class Matrix_Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<This Program is only for square matrix>>");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of ARRAY= ");
		int n = s.nextInt();

		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];

		System.out.println("Enter elements of first MATRIX: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				a[i][j] = s.nextInt();
				// System.out.println("\t");
			}
		}
		System.out.println("First matrix is: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + "\t");
			}
			System.out.println();

		}

		System.out.println("Enter elements of SECOND MATRIX: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {

				b[i][j] = s.nextInt();

			}

		}

		System.out.println("Second matrix is: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {

				System.out.print(b[i][j] + "\t");
			}
			System.out.println();

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				c[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}

		System.out.println("Addition of both MATRIX is: ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {

				System.out.print(c[i][j] + "\t");
			}
			System.out.println();

		}
		s.close();
	}
}
