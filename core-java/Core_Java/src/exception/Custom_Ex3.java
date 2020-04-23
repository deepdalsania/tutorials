package exception;

import java.util.Scanner;

public class Custom_Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers for subtraction : ");
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		System.out.println("A = " + a + "\nB = " + b);
		sub(a, b);

	}

	static void sub(int a, int b) {
		int c;
		if (a < b) {
			try {
				System.out.println("Subtraction isnot possible");
				throw new NegativeAnswerException("Negative Answer Found");
			} catch (NegativeAnswerException e) {
				// TODO: handle exception
				System.out.println(e);
			}

		} else {
			c = a - b;
			System.out.println("Subtraction is possible");
			System.out.println("Answer is : " + c);
		}

	}
}

@SuppressWarnings("serial")
class NegativeAnswerException extends Exception {
	public NegativeAnswerException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}