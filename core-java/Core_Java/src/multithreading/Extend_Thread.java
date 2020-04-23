package multithreading;

import java.util.Scanner;

public class Extend_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< Own Thread created by using extends Thread >>");

		OwnThread o = new OwnThread();

		o.start();
		// o.suspend();
		// o.resume();
		// o.stop();

	}

}

class OwnThread extends Thread {
	public void run() { // throws InterruptedException we should not write this here because it is
						// abstract method of class

		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size= ");
		long n = s.nextInt();
		long mul = 1;
		System.out.println("Elements of array are:");
		for (int i = 1; i <= n; i++) {

			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			mul = mul * i;
		}
		System.out.println("Multiplication is: " + mul);
		s.close();
	}
}