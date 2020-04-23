package loop;

import java.util.Scanner;

public class Ladder_If {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks of FIVE subjects out of 100 = ");
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int m4 = s.nextInt();
		int m5 = s.nextInt();

		int tot = m1 + m2 + m3 + m4 + m5;

		float avg = (float) tot / 5;

		System.out.println("Total marks is : " + tot);
		System.out.println("Average is : " + avg);

		/*
		 * if(p >= 90){ System.out.println("You are pass with FIRST CLASS"); }else if (p
		 * >= 70 && p <= 90 ) { System.out.println("You are pass with SECOND CLASS");
		 * }else if(p >= 50 && p <= 70){
		 * System.out.println("You are pass with DISTINCT CLASS"); }else if(p >= 30 && p
		 * <= 50){ System.out.println("You are pass with PASS CLASS"); } else{
		 * System.out.println("You are FAIL"); }
		 */
		s.close();
	}

}
