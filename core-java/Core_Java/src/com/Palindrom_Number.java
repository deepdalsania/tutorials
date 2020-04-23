package com;

import java.util.Scanner;

public class Palindrom_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to check it is PALINDROME or not= ");
		String s1 = s.nextLine();
		s.close();
		/*
		 * int sum = 0; int a,flag; flag=n;
		 * 
		 * while(n>0){
		 * 
		 * a=n%10; sum=(sum*10)+a; n=n/10; } if(flag==sum){ System.out.println(sum + " "
		 * + "is palindrome number "); }else{ System.out.println(sum + " " +
		 * "isnot palindrome number"); } }
		 */
		String rev = "";
		int l = s1.length();
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println(s1 + " is a Palindrome");
		} else {
			System.out.println(s1 + " is not a Palindrome");
		}
	}
}
