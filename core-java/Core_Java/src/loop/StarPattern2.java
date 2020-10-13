package loop;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int row = sn.nextInt();
		
		//rows
		for(int i = 1; i <= row; i++) {
			
			//column
			for(int j = row; j >= i; j--) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}

}
