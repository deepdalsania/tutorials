package gtu;


public class Sum16Q_3AOR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		try {
			if (x<0 || y<0) {
				throw new InvalidValueException("Invalid values for finding the power");	
			}
			int result = 1;
			for (int i = 1; i < y; i++) {
				result = result * x;
			}
		System.out.println("\n" + x + "^" + y + "=" + result);
		} catch (InvalidValueException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
@SuppressWarnings("serial")
class InvalidValueException extends Exception
{
	public InvalidValueException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}