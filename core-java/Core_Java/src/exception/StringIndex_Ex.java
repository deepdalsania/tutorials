package exception;

import java.util.Scanner;

public class StringIndex_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your HOME ADDRESS: ");
		String s1 = s.next();
		String s2 = s.next();
		String s3 = s.next();
		String s4 = s.next();
		s.close();
		try {
			System.out.println(s1.charAt(50));
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		System.out.println("\n" + "\"" + s1 + "\"" + "\n" + s2 + "\n" + s3 + "\n" + s4);
	}
}
