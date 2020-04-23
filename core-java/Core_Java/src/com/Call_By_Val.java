package com;

import java.util.Scanner;

public class Call_By_Val {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Value v = new Value();
		
		System.out.println("Enter values of A and B = ");
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		System.out.println("Values of A and B Before Swap = "+a+" "+"and"+" "+b);
		v.swap(a,b);
		System.out.println("Values of A and B After Swap = "+a+" "+"and"+" "+b);
		
		
	}

}
class Value
{
	void swap(int a , int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
