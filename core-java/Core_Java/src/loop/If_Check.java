package loop;

import java.util.Scanner;

public class If_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter any two positive number= "); int a = s.nextInt();
		 * int b = s.nextInt(); if (a > b && b != 0 ) {
		 * System.out.println("Division of"+" "+a+" "+"and"+" "+b+" "+"is: "+(a/b)); }
		 * else { System.out.println("Division is not possible."); }
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = s.nextInt();
		System.out.println("Enter b = ");
		int b = s.nextInt();
		System.out.println("Enter c = ");
		int c = s.nextInt();

		if (a > b) {

			if (a > c) {
				System.out.println("a is maximum= " + a);
			} else {
				System.out.println("c is maximum= " + c);
			}
		} else {

			if (b > c) {

				System.out.println("b is maximum= " + b);
			} else {
				System.out.println("c is maximum= " + c);
			}
		}
		s.close();
	}
}
