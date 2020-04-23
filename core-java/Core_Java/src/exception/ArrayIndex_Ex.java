package exception;

import java.util.Scanner;

public class ArrayIndex_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number for array size= ");
		int n = s.nextInt();

		int sum = 0;
		int a[] = new int[n];
		System.out.println("Enter elements of array:");
		for (int i = 0; i <= a.length; i++) {

			try {
				a[i] = s.nextInt();
				sum = sum + a[i];
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		System.out.println("Sum of array elements is: " + sum);
		s.close();
	}

}
