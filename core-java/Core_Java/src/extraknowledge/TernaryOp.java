package extraknowledge;

import java.util.Scanner;

public class TernaryOp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int i = a > b ? a : b;
		System.out.println(i);
		s.close();
	}

}
