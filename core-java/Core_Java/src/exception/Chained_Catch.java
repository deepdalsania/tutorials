package exception;

import java.util.Scanner;

public class Chained_Catch {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your HOME ADDRESS: ");
		String s1 = null;
		String s2 = s.next();
		String s3 = s.next();
		String s4 = s.next();
		s.close();
		try {
			System.out.println(s2.charAt(50));
			// throw new StringIndexOutOfBoundsException();

		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Inside Catch Block");
			System.out.println(e);
			try {
				System.out.println("Inside try block of catch block");
				System.out.println(s1.charAt(10));

			} catch (NullPointerException e1) {
				// TODO: handle exception
				System.out.println(e1);
			}
		}

		System.out.println("\n" + "\"" + s1 + "\"" + "\n" + s2 + "\n" + s3 + "\n" + s4);
	}

}
