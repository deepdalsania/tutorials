package exception;

import java.util.Scanner;

public class Arithmetic_Ex {

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
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
