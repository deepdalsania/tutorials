package loop;

import java.util.Scanner;

public class Switch_Case {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1, a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two positive numbers= ");
		a = s.nextInt();
		b = s.nextInt();

		while (count == 1) {
			System.out.println("Enter your choice" + "\n" + "1)+" + " 2)-" + " 3)*" + " 4)/");
			// if you have a below Java 7 then you have to do like this other wise switch
			// supports direct strin args from java7
			char ch = s.next().charAt(0);
			switch (ch) {
			case '+':
				System.out.println("Addition of" + " " + a + " " + "and" + " " + b + " " + "is:" + (a + b));
				break;

			case '-':
				System.out.println("Subtraction of" + " " + a + " " + "and" + " " + b + " " + "is:" + (a - b));
				break;

			case '*':
				System.out.println("Multiplication of" + " " + a + " " + "and" + " " + b + " " + "is:" + (a * b));
				break;

			case '/':
				System.out.println("Division of" + " " + a + " " + "and" + " " + b + " " + "is:" + (a / b));
				break;

			default:
				System.out.println("You enter wrong choice");
				break;
			}
			System.out.println("Do you want to continue(1/0)?: ");
			count = s.nextInt();
		}
		s.close();
	}

}
