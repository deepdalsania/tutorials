package com;

import java.util.Scanner;

public class Call_By_Ref {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Reference r = new Reference();

		System.out.println("Enter values of A and B = ");
		r.a = s.nextInt();
		r.b = s.nextInt();
		s.close();
		System.out.println("Values of A and B Before Swap = " + r.a + " " + "and" + " " + r.b);
		r.swap(r);
		System.out.println("Values of A and B After Swap = " + r.a + " " + "and" + " " + r.b);

	}

}

class Reference {
	int a, b;

	void swap(Reference r) {
		int temp = r.a;
		r.a = r.b;
		r.b = temp;
	}
}
