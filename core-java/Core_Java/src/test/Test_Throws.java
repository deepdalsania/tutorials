package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_Throws {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int a[] = new int[5];
		System.out.println("Elements of array are:");
		for (int i = 1; i < a.length; i++) {

			a[i] = Integer.parseInt(br.readLine());

			sum = sum + a[i];
		}
		Thread.sleep(3000);
		System.out.println("Sum is: " + sum);
	}

}
