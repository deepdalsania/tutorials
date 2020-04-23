package extraknowledge;

import java.util.Scanner;

public class OddNumReverse {

	public static void main(String args[]) {

		int j;
		System.out.print("Enter Any Positive Number :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println("\nList of Odd Number In Descending Order:");
		for (int i = n - 1; i >= 0; i--) {
			j = 1 + i * 2;
			System.out.println(j);
		}
		s.close();
	}
}