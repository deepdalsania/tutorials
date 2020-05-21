package stackoverflow;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice != 5) {
			choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				// Stuff
				continue;
			case 2:
				// Stuff
				continue;
			case 3:
				// Stuff
				continue;
			case 4:
				// Stuff
				continue;
			default:
				break;
			}
		}
		scan.close();
	}
}
