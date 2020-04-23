package gtu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sum17Q_4C {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void findFile(String s1, File file) {
		File[] f2 = file.listFiles();
		if (f2 != null)
			for (File fil : f2) {
				if (fil.isDirectory()) {
					findFile(s1, fil);
				} else if (s1.equalsIgnoreCase(fil.getName())) {

					System.out.println("File found");
				}
			}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter directory name : ");
		String d = s.nextLine();
		/*
		 * String s1 = s.nextLine().trim(); String f = s.nextLine().trim();
		 */
		findFile(args[0], new File(d));
		s.close();
	}

}
