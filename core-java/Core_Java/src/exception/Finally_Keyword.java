package exception;

import java.util.Scanner;

public class Finally_Keyword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value of A and B for division = ");
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		try {
			System.out.println("Division = " + (a / b));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// System.exit(0);
		finally {
			System.out.println((a > b) ? "A is Greater than B" : "B is Greater than A");
		}

	}
}
