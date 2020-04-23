package loop;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		int sum = 0;
		do {
			System.out.println("Enter a positive number= ");
			a = s.nextInt();
			sum = sum + a;

		} while (a != 0);

		System.out.println("Addition of entered number is= " + sum);
		s.close();
	}
}
