package gtu;

public class Win16Q_3BOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		fibo(n);
	}
	public static void fibo(int a) {
		int x = 0 , y = 1 , sum = 0;
		System.out.println("Fibonacci Series is : "+"\n"+x+"\n"+y);
		
		for (int i = 0; i < a; i++) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.println(sum);
		}
	}
}