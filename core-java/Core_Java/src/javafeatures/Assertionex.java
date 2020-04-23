package javafeatures;

import java.util.Scanner;

public class Assertionex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age : ");
		Scanner s = new Scanner(System.in); 
		int a = s.nextInt();
		assert a <= 18 : "Not Valid" ;
		System.out.println("Age is : "+a);
		s.close();
	}

}
