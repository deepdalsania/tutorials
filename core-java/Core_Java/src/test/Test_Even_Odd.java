package test;

import java.util.Scanner;

public class Test_Even_Odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any positive number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean b = n % 2 == 0 ? true : false;
		if (b) {
			System.out.println("Entered number is EVEN");
		} else {
			System.out.println("Entered number is Odd");
		}
		if ((n & 1) == 0)
			System.out.println("Even number");
		else
			System.out.println("odd number");

		int m = n / 2;
		if (m * 2 == n)
			System.out.println("Even number");
		else
			System.out.println("odd number");
		s.close();
	}

}
