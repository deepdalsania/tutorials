package gtu;

import java.util.Scanner;

public class Sum18Q_5COR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any postive number : ");
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();

		Thread t1 = new Thread(new Thread1(p));

		Thread t2 = new Thread(new Thread2());

		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
		s.close();
	}

}

class Thread1 implements Runnable {
	int flag1 = 0, n;

	public Thread1(int p) {
		// TODO Auto-generated constructor stub
		n = p;

	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag1 = 1;
				break;
			}

		}
		if (flag1 == 0) {
			System.out.println(n + " is Prime number");
		} else {
			System.out.println(n + " isnot Prime number");
		}
	}

}

class Thread2 implements Runnable {
	int flag2 = 0, n;

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Prime Number Series(0-100) : ");
		for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag2 = 1;
				}
			}
			if (flag2 == 1) {
				flag2 = 0;
			} else {
				System.out.println(i);
			}
		}
	}

}