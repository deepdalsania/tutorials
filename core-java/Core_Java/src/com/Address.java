package com;

import java.util.Scanner;

public class Address {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your ADDRESS: ");
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		String s3 = s.nextLine();
		String s4 = s.nextLine();
		s.close();
		System.out.println("\n" + "\""+s1+"\"" + "\n"+s2+"\n"+s3+"\n"+s4);
	
	}

}
