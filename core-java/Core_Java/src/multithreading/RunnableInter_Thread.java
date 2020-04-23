package multithreading;

import java.util.Scanner;

public class RunnableInter_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< Own Thread created by using implements Runnable >>");

		OwnThread1 ow = new OwnThread1();

		Thread t = new Thread(ow);

		t.start();
		// t.suspend();
		// t.resume();
		// t.stop();

	}

}

class OwnThread1 implements Runnable {
	public void run() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size= ");
		long n = s.nextInt();
		long mul = 1;
		System.out.println("Elements of array are:");
		for (int i = 1; i < n; i++) {

			try {
				System.out.println(i);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			mul = mul * i;
		}
		System.out.println("Multiplication is: " + mul);
		s.close();
	}
}