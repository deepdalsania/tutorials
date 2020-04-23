package gtu;

import java.util.Scanner;

public class Win15Q_2A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		System.out.println("Enter value of object 1");
		t1.getTime();
		System.out.println("Enter value of object 2");
		t2.getTime();
		t3 = t3.addTime(t1, t2);
		System.out.println("Total time is : ");
		t3.putTime();
	}
}

class Time {
	int h, m;

	public void getTime() {
		System.out.println("Enter hours : ");
		Scanner s = new Scanner(System.in);
		h = s.nextInt();
		System.out.println("Enter Minutes : ");
		m = s.nextInt();
		s.close();
	}

	public Time addTime(Time t1, Time t2) {

		this.m = t1.m + t2.m;
		this.h = this.m / 60;
		this.m = this.m % 60;
		this.h = t1.h + t2.h + this.h;
		return this;
	}

	public void putTime() {
		System.out.println("hh:mm" + "\n" + h + ":" + m);
	}
}