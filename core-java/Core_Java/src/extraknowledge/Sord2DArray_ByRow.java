package extraknowledge;

import java.util.Arrays;

public class Sord2DArray_ByRow {

	// Java code to sort 2D matrix row-wise in Ascending order
		static int sortRowWise(int m[][]) 
		{ 
			// One by one sort individual rows. 
			for (int i = 0; i < m.length; i++) 
				Arrays.sort(m[i]); 
			System.out.println("Sorted Array is : ");
			// printing the sorted matrix 
			for (int i = 0; i < m.length; i++) { 
				for (int j = 0; j < m[i].length; j++) 
					System.out.print(m[i][j] + " "); 
				System.out.println(); 
			} 

			return 0; 
		} 

		// driver code 
		public static void main(String args[]) 
		{ 
			int a[][] = { { 3,9,5,8 }, 
					{ 9,2,7,4 }, 
					{ 4,8,1,5},
					{ 7,5,3,6}}; 
		System.out.println("Before Sorting Array is: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " "); 
				
			}
			System.out.println();
		}
		sortRowWise(a); 
		} 
	} 

	
	
	
	
//Java code to sort 2D matrix row-wise in descending order 
/*	static int sortRowWise(int m[][]) 
	{ 
		// One by one sort individual rows. 
		for (int i = 0; i < m.length; i++) 
			Arrays.sort(m[i]); 
		
		System.out.println("Sorted Array is : ");
		// printing the sorted matrix 
		for (int i = m.length - 1; i >= 0 ; i--) { 
			for (int j = m[i].length -1; j >= 0 ; j--) 
				System.out.print(m[i][j] + " "); 
			System.out.println(); 
		} 

		return 0;
	} 

	// driver code 
	public static void main(String args[]) 
	{ 
		int a[][] = { { 3,9,5,8 }, 
					{ 9,2,7,4 }, 
					{ 4,8,1,5},
					{ 7,5,3,6}}; 
		System.out.println("Before Sorting Array is: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " "); 
				
			}
			System.out.println();
		}
		sortRowWise(a); 
	} 
}*/ 
