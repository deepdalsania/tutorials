package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Printstream {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/DEEP/sixth.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number for range : ");
		int n = Integer.parseInt(br.readLine());
		PrintStream ps = new PrintStream(f);
		System.out.println("<< Odd Number >>");
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				ps.println(i);
				System.out.println(i);
			}
		}
		ps.flush();
		ps.close();
	}
}
