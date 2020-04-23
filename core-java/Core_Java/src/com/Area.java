package com;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		do {
			
			final float PI = 3.14f;
			float r ;
			float h;
			double ac;
			double aco;
			
			DecimalFormat f = new DecimalFormat("##.00"); 
			Scanner s = new Scanner(System.in);
			System.out.println("<< AREA OF CYLINDER >>");
			System.out.println("Enter the RADIUS of CYLINDER: ");
			r = s.nextFloat();
			System.out.println("Enter the HEIGHT of CYLINDER: ");
			h = s.nextFloat();
			
			ac = 2 * PI * r * h + 2 * PI * r * r ;
			
			System.out.println("AREA OF CYLINDER IS: "+f.format(ac)+" " + "m\u00b2");
			
			System.out.println("<< AREA OF CONE >>");
			System.out.println("Enter the RADIUS of CONE: ");
			r = s.nextFloat();
			System.out.println("Enter the HEIGHT of CONE: ");
			h = s.nextFloat();
			
			aco = PI * r *(r + Math.sqrt(h * h + r * r) );
			
			System.out.println("AREA OF CONE IS: "+f.format(aco)+" " + "m\u00b2");
			
			System.out.println("Do you want to continue(1/0)? : ");
			count = s.nextInt();
			s.close();
		} while (count == 1);
	}

}
