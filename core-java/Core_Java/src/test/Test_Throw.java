package test;

import java.util.Scanner;

@SuppressWarnings("serial")
public class Test_Throw extends Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter 2 num");
			a = s.nextFloat();
			b = s.nextFloat();
			s.close();
			if (a < 0.2 || b < 0.2) {
				throw new Test_Throw();
			}
			System.out.println("multiplication = " + (a * b));

		} catch (Test_Throw e) {
			// TODO: handle exception
			System.out.println("Exception : Numbers are too small");
			System.out.println("Re-enter value of num ");
			a = s.nextFloat();
			b = s.nextFloat();
			System.out.println("multiplication = " + (a * b));
		} catch (NumberFormatException e1) {
			// TODO: handle exception
			System.out.println(e1);
		}
	}

}
