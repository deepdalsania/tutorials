package multithreading;

import java.util.Scanner;

public class ITC_Duplex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		@SuppressWarnings("unused")
		Duplex d = new Duplex(c);
		@SuppressWarnings("unused")
		Duplex1 d1 = new Duplex1(c);
		
		
	}

}
class Customer 
{
	Scanner s = new Scanner(System.in);
	String s1 ;//= "Hi";
	String s2 = "Hello";
	String s3 ;//= "I Want To Book A Table At Your Restaurant.";
	String s4 = "Yes, Please Tell Me Your Time I will Check.";
	String s5 ;//= "At 8:00 PM Tonight.";
	String s6 = "Sir, Table Is Available. It will Reserve For You Anything Else Sir";
	String s7 ;//= "No Thanks Bye";
	String s8 = "Bye Have A Good Day Sir";
	
	synchronized void disp(Customer c){
		
		
			try {
					
					System.out.println("Customer : ");
					s1 = s.nextLine();
					wait();/*if we pass time in wait that means it will teransfer the control to other thread and in specifice time 
							if notify call then trnsfer the controol to previous waited threaed */ 
					notify();
					Thread.sleep(1000);
					System.out.println("Customer : ");
					s3 = s.nextLine();
					wait();
					notify();
					Thread.sleep(1000);
					System.out.println("Customer : ");
					s5 = s.nextLine();
					wait();
					notify();
					Thread.sleep(1000);
					System.out.println("Customer : ");
					s7 = s.nextLine();
					wait();
					notify();
					Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
	}
	synchronized void display(Customer c) throws InterruptedException{
		//System.out.println("Give answer")
		if (s1.equalsIgnoreCase("Hi")) {
			System.out.println("Owner : "+s2);
			notify();
			wait();
			Thread.sleep(1000);
		}else{
			System.out.println("Owner : Hello Ji!");
			notify();
			wait();
			Thread.sleep(1000);
		}
		if (s3.equalsIgnoreCase("I Want To Book A Table At Your Restaurant")) {
			System.out.println("Owner : "+s4);
			notify();
			wait();
			Thread.sleep(1000);
		}else if (s3.equalsIgnoreCase("What is Your Restaurant Menu")) {
			System.out.println("Owner : Multicuisine");
			notify();
			wait();
			Thread.sleep(1000);
		}else{
			System.out.println("Owner : Restaurant will open till 12:00 PM");
			notify();
			wait();
			Thread.sleep(1000);
		}
		if (s5.equalsIgnoreCase("At 8:00 PM Tonight")) {
			System.out.println("Owner : "+s6);
			notify();
			wait();
			Thread.sleep(1000);
		}else if (s5.equalsIgnoreCase("Ok Then Parcle Two Plates Pasta ")) {
			System.out.println("Owner : Sure Sir");
			notify();
			wait();
			Thread.sleep(1000);
		}else{
			System.out.println("Owner : Anything Else Sir");
			notify();
			wait();
			Thread.sleep(1000);
		}
		if (s7.equalsIgnoreCase("No Thanks Bye")) {
			System.out.println("Owner : "+s8);
			notify();
			wait();
			Thread.sleep(1000);
		}else{
			System.out.println("Owner : Have a Good Day Ahed Bye");
			notify();
			wait();
			Thread.sleep(1000);
		}
	}
}
class Duplex implements Runnable
{

	Customer c;
	//String s;
	public Duplex(Customer c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	//	this.s = s;
		Thread t = new Thread(this);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
	}

	public void run() {
		// TODO Auto-generated method stub
		c.disp(c);
	}
	
}
class Duplex1 implements Runnable
{
	Customer c;
	//String s;
	public Duplex1(Customer c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	//	this.s = s;
		Thread t = new Thread(this);
	//	t.setPriority(Thread.MIN_PRIORITY);
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			c.display(c);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

