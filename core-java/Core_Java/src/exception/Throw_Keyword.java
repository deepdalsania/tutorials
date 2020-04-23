package exception;

public class Throw_Keyword {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			a();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		
			System.out.println(e);
		}
		finally{
			System.out.println("Exception Catch Inside Main Method"); 	
		}
		
	}	
	static void a(){
		
		try {
			
			b();
			
			} catch (StringIndexOutOfBoundsException e){
				// TODO: handle exception
				System.out.println(e);
				//
				throw new ArrayIndexOutOfBoundsException("Exception Generated Inside A Method");
			}
			finally{
				
				System.out.println("Exception Catch Inside A Method");
			
			}
	}
	static void b(){
		
		
	//	Integer i = new Integer("1");
		String s = new String("DEEP");
		try{
		System.out.println("Inside B Method");
		int a = Integer.parseInt(s);
		System.out.println(a);
	//	System.out.println(i);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		throw new StringIndexOutOfBoundsException("Exception Generated Inside B Method");
	}
		
	

}