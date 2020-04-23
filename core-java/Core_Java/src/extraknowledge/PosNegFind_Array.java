package extraknowledge;

import java.util.Scanner;

public class PosNegFind_Array {

	public static void main(String[] args) {

		// intialize and declaring the objects.
		int positive, negative;
		System.out.print("How many Number you want to Enter : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];

		// enter number you have to enter.

		// enter the numbers.
		System.out.println("Enter " + n + " Numbers : ");

		// this is to calculate the type of the number.
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int j = 0; j < n; j++) {
			if (arr[j] < 0) {
				negative = arr[j];
				System.out.println(negative + " is a negative number");
			} else {
				positive = arr[j];
				System.out.println(positive + " is a positive number");
			}
		}
		scan.close();
	}
}
