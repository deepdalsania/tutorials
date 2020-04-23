package oops;

import java.util.Scanner;

public class JumpDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any positive number for ARRAY size= ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();

		}
		System.out.println("ODD number from entered number is: ");
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 == 0) {
				continue;
			}
			System.out.println(a[j]);
		}
		s.close();
	}

}
