package multithreading;

import java.util.Scanner;

public class Bank_Sync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Bal b = new Bal();
		System.out.println("Enter the amount for WITHDRAW : ");
		int w = s.nextInt();
		System.out.println("WITHDRAWAL AMOUNT is : " + w);
		@SuppressWarnings("unused")
		User1 u1 = new User1(b, w);
		System.out.println("Enter the amount for  DEPOSIT : ");
		int d = s.nextInt();
		System.out.println("DEPOSIT AMOUNT is : " + d);
		@SuppressWarnings("unused")
		User2 u2 = new User2(b, d);
		s.close();
	}

}

class User1 implements Runnable {
	Bal b;
	int w;

	public User1(Bal b, int w) {
		// TODO Auto-generated constructor stub
		this.b = b;
		this.w = w;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		synchronized (b) {
			b.wd(w);
		}
	}

}

class User2 implements Runnable {

	Bal b;
	int d;

	public User2(Bal b, int d) {
		// TODO Auto-generated constructor stub
		this.b = b;
		this.d = d;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub

		synchronized (b) {
			b.deposit(d);
		}
	}

}

class Bal {
	int tot = 50000;

	void wd(int w) {
		if (tot < w) {
			try {
				wait();
				if (tot > w) {
					tot = tot - w;
					System.out.println("Your updated BALANCE after WITHDRAW is : " + tot);
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}

		} else {
			System.out.println("You have sufficient money for WITHDRAW");
			tot = tot - w;
			System.out.println("Your updated BALANCE after WITHDRAW is : " + tot);
		}
	}

	void deposit(int d) {
		tot = tot + d;
		System.out.println("Your updated BALANCE after DEPOSIT is : " + tot);
		notify();
	}
}