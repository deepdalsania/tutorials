package gtu;

import java.util.Scanner;

public class Win16Q_3B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("\n" + a + "^" + b + "=" + new Win16Q_3B().Power(a, b));
		s.close();
	}

	public long Power(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else {
			return x * Power(x, y - 1);
		}

	}
}
