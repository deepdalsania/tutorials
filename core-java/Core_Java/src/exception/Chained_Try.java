package exception;

import java.util.Scanner;

public class Chained_Try {

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
		// Integer i = new Integer("1");
		String s1 = new String("DEEP");

		try {
			System.out.println("Inside try block");
			int c = a / b;
			System.out.println("Division is : " + c);

			try {
				System.out.println("Inside try block of try block ");
				int d = Integer.parseInt(s1);
				System.out.println(d);
				// System.out.println(i);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
