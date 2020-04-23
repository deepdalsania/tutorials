package loop;

import java.util.Scanner;

public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of a = ");

		int a = s.nextInt();
		System.out.println("Enter a value of b = ");
		int b = s.nextInt();

		if (a > b) {
			System.out.println("a is bigger then b");
		} else {
			System.out.println("b is bigger then a");
		}
		s.close();
	}
}