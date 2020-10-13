package loop;

import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sn.nextInt();
		
		for (int i = 0; i < row; i++) {
			
			for(int j = row; j >= i; j--) {
				
				System.out.print(" ");
				
			}
			for(int k = 0; k <= i; k++) {
				
				System.out.print("*");
				
			}
			for(int m = 1; m <= i; m++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}
