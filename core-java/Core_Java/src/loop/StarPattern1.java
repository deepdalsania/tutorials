package loop;

import java.util.Scanner;

public class StarPattern1 {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter the number of Row: ");
		int row = sn.nextInt();
		
		//rows
		for (int r = 0; r < row; r++) {
			
			//column
			for (int c = 0; c <= r; c++) {
				
				System.out.print("*");
				
			}
			
			System.out.print("\n");
		}
	}

}
