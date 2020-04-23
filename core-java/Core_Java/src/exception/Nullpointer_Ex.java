package exception;

import java.util.Scanner;

public class Nullpointer_Ex {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your HOME ADDRESS: ");
		String s1 = null;
		String s2 = s.nextLine();
		String s3 = s.nextLine();
		String s4 = s.nextLine();
		s.close();
		try {
			System.out.println(s1.charAt(4));
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("\n" + "\"" + s1 + "\"" + "\n" + s2 + "\n" + s3 + "\n" + s4);

	}

}
