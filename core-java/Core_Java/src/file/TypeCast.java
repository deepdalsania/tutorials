package file;

import java.util.Scanner;

public class TypeCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< IMPLICIT CASTING >>");
		int d = 50;
		float f = d;
		System.out.println("F : " + f);

		System.out.println("<< EXPLICIT CASTING >>");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size= ");
		int n = s.nextInt();

		int sum = 0;
		int a[] = new int[n];
		float avg;
		System.out.println("Enter elements of array:");
		for (int i : a) {
			a[i] = s.nextInt();

			sum = sum + a[i];
		}
		System.out.println("Sum is: " + sum);
		avg = (float) sum / n;
		System.out.println("Acverage is : " + avg);
		s.close();
	}

}
