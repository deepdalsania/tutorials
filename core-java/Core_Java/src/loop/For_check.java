package loop;

import java.util.Scanner;

public class For_check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter number for range: ");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
		for(int i=2; i<=n; i=i+2){	
			System.out.println(i);
		}
		
	/*for(int i=n; i>=1; i--){
			System.out.println(i);
		}*/
		
		/*for(int i=10; i>=0; i=i-2){
			System.out.println(i);
		}*/
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array= ");
		int k = s.nextInt();
		
		int i[] = new int[k];
		System.out.println("Even numbers till array size");
		for (int j = 2; j < i.length; j=j+2) {
			
			System.out.println(j);
		}
		*/
		/*for (int j : i) {
			System.out.println(j);
		}*/
		
		s.close();
	}

}
