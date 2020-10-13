package test;

public class Test_TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 5 , b = 5 ;
		try {
			System.out.println("Div = "+(a/b));
			//break; if we are using break without loop then it will give an error.
		} catch (ArithmeticException e) {
			// TODO: handle exception
		System.out.println(e);
		//break; if we are using break without loop then it will give an error
		}*/
		
		/*conclusion is that we cannot alter the flow of excecution first try second catch after finally if catch is not there then we can use 
		 * finally after try
		 * three sequences
		 * try - catch - finally
		 * try - multiple catch - finally
		 * try - finally*/
		/*try {
					System.out.println("Div = "+(a/b));
				}finally{
					System.out.println("Add = "+(a+b));
				}catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println(e);
				}*/
		/*finally{
					System.out.println("Add = "+(a+b));
				}catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println(e);
				}try {
					System.out.println("Div = "+(a/b));
				}*/
		int a = 5 , b = 0 ;
		
		try {
			System.out.println("Div = "+(a/b));
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally{
			System.out.println("Add = "+(a+b));
		}
	}

}
