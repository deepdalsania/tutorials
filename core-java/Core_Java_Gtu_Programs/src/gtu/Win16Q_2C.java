package gtu;

import java.util.Scanner;

public class Win16Q_2C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many book you want to check : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Book_Details b = new Book_Details();
		while (n > 0 && n <= 35) { // beacuse total stock of all books is 35
			System.out.println("Available Book");
			System.out.println("Book Title\tAuthor Name");
			for (int i = 0; i < 5; i++) {
				System.out.println(b.book_title[i] + "\t\t" + b.author_name[i]);
			}
			b.get();
			b.disp();
			System.out.println("Do you want to purchase this book?Yes/No ");
			String ch = s.next();
			if (ch.equalsIgnoreCase("Yes")) {
				b.bill();

			}
			n--;
		}
		s.close();
	}

}

class Book {
	Scanner s = new Scanner(System.in);
	String book_title[] = new String[5];
	String author_name[] = new String[5];
	String b_title, author;

	public Book() {
		// TODO Auto-generated constructor stub
		book_title[0] = "AAA";
		book_title[1] = "BBB";
		book_title[2] = "CCC";
		book_title[3] = "DDD";
		book_title[4] = "EEE";

		author_name[0] = "PPP";
		author_name[1] = "QQQ";
		author_name[2] = "RRR";
		author_name[3] = "SSS";
		author_name[4] = "TTT";

	}

	public void get() {
		System.out.println("Enter book title : ");
		b_title = s.next();
	}
}

class Book_Details extends Book {
	int price[] = new int[5];
	int stock[] = new int[5];

	public Book_Details() {
		// TODO Auto-generated constructor stub
		super();
		price[0] = 100;
		price[1] = 200;
		price[2] = 300;
		price[3] = 400;
		price[4] = 500;

		stock[0] = 4;
		stock[1] = 10;
		stock[2] = 14;
		stock[3] = 2;
		stock[4] = 5;

	}

	public void disp() {
		int j = 0;
		for (int i = 0; i < 5; i++) {
			j = i;
			if (book_title[i].equals(b_title)) {
				break;
			}
		}
		System.out.println(
				"Price of " + book_title[j] + " is " + price[j] + " and No. of books available are " + stock[j]);
	}

	public void bill() {
		int j = 0;
		for (int i = 0; i < 5; i++) {
			j = i;
			if (book_title[i].equals(b_title)) {
				break;
			}

		}

		System.out.println("Total Pyament is :" + price[j]);
		stock[j] = stock[j] - 1;
	}

}