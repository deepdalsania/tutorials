package exception;

import java.util.Scanner;

public class Custom_Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of A and B : ");
		int a = s.nextInt();
		int b = s.nextInt();

		int c = a + b;
		float t = (float) c / 50000000000.1f;
		call(t);
		s.close();
	}

	static void call(float t) {
		if (t < 0.000001f) {
			try {
				throw new NumberIsNegligibleException("Number is Negligible.");
			}

			catch (NumberIsNegligibleException e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Number isnot Negligible.");
		}
	}
}

@SuppressWarnings("serial")
class NumberIsNegligibleException extends Exception {
	NumberIsNegligibleException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}