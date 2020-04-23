package extraknowledge;

import java.util.Scanner;

public class PosNegCount_Array {

	public static void main(String args[]) {
		// intialize and declaring the objects.
		int n, positive = 0, negative = 0, zero = 0, i;
		int arr[] = new int[50];
		Scanner scan = new Scanner(System.in);

		// enter number you have to enter.
		System.out.print("How many Number you want to Enter : ");
		n = scan.nextInt();

		// enter the numbers.
		System.out.println("Enter " + n + " Numbers : ");

		// this is to calculate the type of the number.
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (arr[i] < 0) {
				negative++;
			} else if (arr[i] == 0) {
				zero++;
			} else {
				positive++;
			}
		}
		// print all +ve,-ve and zero number.
		System.out.print("Positive Numbers are: " + positive);
		System.out.print("\nNegative Numbers are: " + negative);
		System.out.print("\nZeros are: " + zero);
		scan.close();
	}
}
