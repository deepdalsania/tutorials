package exception;

import java.util.Scanner;

public class Custom_Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("<< Custom Exception for checking age is valid for votiong or not. >>");
		System.out.println("Enter age : ");
		int a = s.nextInt();
		check(a);
		s.close();
	}

	static void check(int a) {

		if (a < 18) {
			try {
				throw new InvalidAgeException("You are under age for voting.");
			} catch (InvalidAgeException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		} else {
			System.out.println("You are able for voting.");
		}
	}

}

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}
