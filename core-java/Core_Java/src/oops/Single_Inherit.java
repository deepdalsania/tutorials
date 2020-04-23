package oops;

import java.util.Scanner;

public class Single_Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Der d = new Der();
		d.mul();
		d.disp_mul();
	}

}

class Bas {
	private int a;
	protected int b;

	public void get_ab() {
		System.out.println("Enter the value of A and B :");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		s.close();
	}

	int get_a() {
		return a;
	}

	void show_a() {
		System.out.println("A = " + a);
	}
}

class Der extends Bas {
	int c;

	void mul() {
		get_ab();
		c = get_a() * b;
	}

	void disp_mul() {

		show_a();
		System.out.println("B = " + b);
		System.out.println("C = " + c);
	}
}