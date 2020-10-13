package loop;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number of row: ");
		int row = sn.nextInt();
		
		for(int i = 1; i <= row; i++) {
			
			for(int j = row; j >= i; j--) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for(int i = 1; i < row; i++) {
			
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}
