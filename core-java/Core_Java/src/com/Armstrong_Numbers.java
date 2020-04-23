package com;

import java.util.Scanner;
public class Armstrong_Numbers {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter any number to check it is ARMSTRONG or not= ");
			int n = s.nextInt();
			s.close();
			int sum = 0;
			int temp;
			temp = n;
			for (int i = n; i > 0; i--) {
				int a = n%10;
				sum = (a*a*a) + sum ;
				n= n/10;
			}
			if(temp==sum ){
				System.out.println(temp+" is an Armstrong Number");
			}else{
				System.out.println(temp+" isnot an Armstrong Number");
			}
			
		}

	}

