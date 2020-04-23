package com;

//import java.util.Scanner;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul = 1;
		int i[] = {1,2,3,4,5};
		System.out.println("Elements of array are: ");
		 for (int j : i) {
			System.out.println(j);
			mul = mul * j;
		}
		 System.out.println("Multiplication of all elements is = "+mul);
		
		/*int i[][] = new int[2][2];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first element:");
		i[0][0]=s.nextInt();
		
		System.out.println("i[0][0] = "+i[0][0]);
		System.out.println("Enter second element:");
		i[0][1]=s.nextInt();
		System.out.println("i[0][1] = "+i[0][1]);
		
		System.out.println("Enter third element:");
		i[1][0]=s.nextInt();
		
		System.out.println("i[1][0] = "+i[1][0]);
		
		System.out.println("Enter first element:");
		i[1][1]=s.nextInt();
		
		System.out.println("i[1][1] = "+i[1][1]);
		System.out.println("Addition of all element:");
		int sum = i[0][0]+i[0][1]+i[1][0]+i[1][1];
		System.out.println("sum = "+sum);*/
		
	
	}

}
