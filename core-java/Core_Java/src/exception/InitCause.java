package exception;

public class InitCause {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		try {
			@SuppressWarnings("unused")
			int b = a / 0 ;
			ArithmeticException e1 = new ArithmeticException();
			e1.initCause(new ArithmeticException());
			
		} catch (ArithmeticException e1) {
			// TODO: handle exception
			System.out.println(e1);
		}
		
	}

}
