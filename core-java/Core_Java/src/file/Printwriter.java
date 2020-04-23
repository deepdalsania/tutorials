package file;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Printwriter {

	/**
	 * @param args
	 * @throws Exception
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("D:/DEEP/fifth.txt");
		f.createNewFile();
		PrintWriter pw = new PrintWriter(f);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your HOME ADDRESS: ");
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		String s3 = s.nextLine();
		String s4 = s.nextLine();
		s.close();
		pw.write(s1 + " ," + " ");
		pw.write(s2 + " ," + " ");
		pw.write(s3 + " ," + " ");
		pw.write(s4);
		pw.flush();
		pw.close();

		System.out.println("\n" + "\"" + s1 + "\"" + "\n" + s2 + "\n" + s3 + "\n" + s4);

		/*
		 * PrintWriter pw1 = new PrintWriter(System.out); int a; int sum = 0; do{
		 * pw1.write("Enter a positive number= "); a = s.nextInt(); sum = sum + a;
		 * 
		 * }while(a != 0);
		 * 
		 * pw1.write("Addition of entered number is= "+sum); pw1.flush(); pw1.close();
		 */

	}

}
