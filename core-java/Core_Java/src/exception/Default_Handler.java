/*package lm_2;

import java.util.Scanner;

public class Default_Handler {

	/**
	 * @param args
	 */
/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	System.out.println("If you enter value of B as 0 then it will generate Exception");
	System.out.println("Enter the value of A and B for division = ");
	int a = s.nextInt();
	int b = s.nextInt();
	
	System.out.println("Divison is = "+(a/b));
}

}*/
package exception;

import java.util.Scanner;

public class Default_Handler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int tot;
		float avg;

		System.out.println("Enter the name of student: ");
		s.next();
		System.out.println("Enter the marks of three subjects: ");
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		s.close();
		tot = m1 + m2 + m3;

		System.out.println("Total = " + tot);

		avg = (float) tot / 3;
		System.out.println("Average = " + avg);

	}

}
