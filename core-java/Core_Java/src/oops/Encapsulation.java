package oops;

import java.util.Scanner;

public class Encapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Encap e = new Encap();
		System.out.println("Values of Variables");
		System.out.println("A = ");
		e.a = s.nextInt();
		System.out.println("C = ");
		e.c = s.nextInt();
		System.out.println("D = ");
		e.d = s.nextInt();
		e.get();
		e.disp();
		s.close();
	}

}

class Encap extends AccessSpecifier {
	int a;
	private int b;
	protected int c;
	public int d;

	Scanner s = new Scanner(System.in);

	public void get() {
		System.out.println("Enter the value of B = ");
		b = s.nextInt();

	}

	protected void disp() {

		System.out.println("Addition of all variables  = " + (a + b + c + d));
		System.out.println("i : " + i);
		System.out.println("j : " + j);

	}

}