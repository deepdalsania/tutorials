package multithreading;

import java.util.Scanner;

public class Default_Thread {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Thread t = Thread.currentThread();
		System.out.println("Default Thread : " + t);
		System.out.println("Name of current Thread is : " + t.getName());
		t.setName("IT");
		System.out.println("Name of created Thread is : " + t.getName());
		System.out.println("Priority of created Thread is : " + t.getPriority());
		t.setPriority(4);
		System.out.println("Maximum priority of thread : " + Thread.MAX_PRIORITY);
		System.out.println("Default priority of thread : " + Thread.NORM_PRIORITY);
		System.out.println("Minimum priority of thread : " + Thread.MIN_PRIORITY);
		System.out.println("New Thread : " + t);

		System.out.println("Enter array size= ");
		int n = s.nextInt();
		int sum = 0;

		System.out.println("Elements of array are:");
		for (int i = 1; i < n; i++) {

			System.out.println(i);
			Thread.sleep(1000);
			sum = sum + i;
		}
		System.out.println("Sum is: " + sum);
		s.close();
	}

}
