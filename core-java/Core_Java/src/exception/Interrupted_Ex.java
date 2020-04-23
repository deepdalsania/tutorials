package exception;

import java.util.Scanner;

public class Interrupted_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number for array size= ");
		int n = s.nextInt();
		s.close();
		int sum = 0;
		System.out.println("Elements of array are:");
		for (int i = 1; i < n; i++) {

			try {
				System.out.println(i);
				/*
				 * break; if we are using here then it will give an error like unreachble code
				 * because exception will generate after this statement but here loop will break
				 * then WHAT IS THE USE OF CATCH.
				 */
				Thread.sleep(1000);
				// break; using break here it will give output as 1 and sum would be 0

			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			sum = sum + i;
		}
		System.out.println("Sum of array elements is: " + sum);
	}

}
