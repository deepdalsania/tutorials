package gtu;

import java.util.Scanner;

public class Win16Q_2COR {

	int id_no, no_of_subject_register = 6;
	int sub_code[] = new int[6];
	int sub_credit[] = new int[6];
	String grade[] = new String[8];
	int grade_point[] = new int[8];
	float spi;
	int sum = 0, sum1 = 0;

	public Win16Q_2COR() {
		// TODO Auto-generated constructor stub
		sub_code[0] = 2110703;
		sub_credit[0] = 5;
		sub_code[1] = 2110704;
		sub_credit[1] = 5;
		sub_code[2] = 2110705;
		sub_credit[2] = 5;
		sub_code[3] = 2110706;
		sub_credit[3] = 5;
		sub_code[4] = 2110707;
		sub_credit[4] = 5;
		sub_code[5] = 2110708;
		sub_credit[5] = 5;

	}

	public void calculateSpi() {
		for (int i = 0; i <= 5; i++) {
			if (grade[i].equals("AA")) {
				grade_point[i] = 10;
			} else if (grade[i].equals("AB")) {
				grade_point[i] = 9;
			} else if (grade[i].equals("BB")) {
				grade_point[i] = 8;
			} else if (grade[i].equals("BC")) {
				grade_point[i] = 7;
			} else if (grade[i].equals("CC")) {
				grade_point[i] = 6;
			} else if (grade[i].equals("CD")) {
				grade_point[i] = 5;
			} else if (grade[i].equals("DD")) {
				grade_point[i] = 4;
			} else {
				grade_point[i] = 0;
			}
			this.sum = sum + (sub_credit[i] * grade_point[i]);
			this.sum1 = sum1 + sub_credit[i];
		}

		spi = sum / sum1;
		System.out.println("Your SPI is : " + spi);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Win16Q_2COR w = new Win16Q_2COR();
		int l = args.length;
		if (l <= 0) {
			System.out.println("enter enrollment no list");
		}
		for (int i = 0; i < 1; i++) {
			System.out.println("Enter details :  ");
			System.out.println("Subject Code \t Subject Credit \t Grade \n");
			System.out.println("------------------------------------------------");

			for (int j = 0; j <= 5; j++) {
				System.out.print(w.sub_code[j] + "\t\t\t" + w.sub_credit[j] + "\t\t\t");
				String s1 = s.nextLine();
				w.grade[j] = s1;

			}
			w.calculateSpi();
		}
		s.close();
	}

}
