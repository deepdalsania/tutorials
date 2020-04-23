package com;

public class Pattern_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Pattern 1");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		/*System.out.println("Pattern 2");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(j);
			}
			System.out.print("\n");
		}*/
	
		/*System.out.println("Pattern 3");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(i);
			}
			System.out.print("\n");
		}*/
		
		/*System.out.println("Pattern 4");
		for (int i = 5; i>=1; i--) {
			for (int j = 1; j <i; j++) {
				
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		System.out.println("Pattern 5");
		for (int i = 1; i<=5; i++) {
			for (int j = 5; j >i; j--) {
				
				System.out.print(" ");
			}
			for (int k = 1; k<2*(i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*System.out.println("Pattern 6");
		for (int i = 5; i>=1; i--) {
			for (int j = 1; j <i; j++) {
				
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}*/
		
		/*System.out.println("Pattern 7");
		for (int i = 5; i>=1; i--) {
			for (int j = 1; j <i; j++) {
				
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.println(i);
			}
			System.out.println();
		}*/
	}
	

}
