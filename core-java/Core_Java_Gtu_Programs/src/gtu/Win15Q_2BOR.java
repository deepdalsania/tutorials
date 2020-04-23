package gtu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Win15Q_2BOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter radius of a circle : ");
		Scanner s = new Scanner(System.in);
		float radius = s.nextFloat();
		new Win15Q_2BOR().area(radius);
		s.close();
	}

	public void area(float radius) {
		final float PI = 3.14f;
		DecimalFormat f = new DecimalFormat("##.00");// i am using this for getting 2 digit after decimal point.
		float area = PI * radius * radius;
		System.out.printf("Area of Circle is  : " + f.format(area));

	}
}
