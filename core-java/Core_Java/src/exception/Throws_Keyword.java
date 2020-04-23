package exception;

import java.io.IOException;


public class Throws_Keyword {

	/**
	 * @param args
	 */
	static void add() throws InterruptedException,IOException  {  
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter a number for array size= ");
		int n = s.nextInt();*/
		int sum = 0;
		int a[] = new int[5];
		System.out.println("Elements of array are:");
		for (int i = 1 ; i < a.length  ; i++) {
 			
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);				
			} 
			sum = sum + i;
		}
		System.out.println("Sum is: "+sum);
		throw new IOException("IO Exception Generated");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				try {
					add();
					
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e);
					System.out.println("IO Exception Handled");
				}
	}

}
