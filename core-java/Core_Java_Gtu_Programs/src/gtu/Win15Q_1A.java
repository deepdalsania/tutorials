package gtu;

public class Win15Q_1A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={10,20,30,40};
		int sum = 0;
		
		for (int i : a) {
			
			sum = sum + i ;
			
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+((float)sum/4));
	
	}

}
