package gtu;

public class Win16Q_3COR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		int n[] = new int[args.length];
		
		for (int i = args.length - 1; i >=0 ; i--) {
			
		}
		
		for (int i = 0; i < args.length; i++) {
			n[i] = Integer.parseInt(args[i]); // args has string type so we have to convert
			try {
				if (n[i] < 0) {
					throw new NegativeNumberException("Negative number is not allow");
				}else if (n[i] % 10 == 0) { /* it means that je number enter kariae aek sarkha(evenly) 10 na bhagma vechi sakiae 100 na
				 					10 bhag kariae to badha 10 na thay 150 na 15 aem*/
					throw new EvenlyDivisibleException("No Number is evely divisible by 10");
				}else if (n[i] > 1000 && n[i] < 2000) {
					throw new NumberRangeException("Number between 1000 and 2000 is not allow");
				}else if (n[i] > 7000) {
					throw new LargeNumberException("Number greater than 7000 is not allow");
				}else{
					sum = sum + n[i] ;
				}
			} catch (NegativeNumberException e) {
				// TODO: handle exception
				System.out.println(e);
			//	continue ;
			}catch (EvenlyDivisibleException e1) {
				// TODO: handle exception
				System.out.println(e1);
			//	continue ;
			}catch (NumberRangeException e2) {
				// TODO: handle exception
				System.out.println(e2);
			//	continue ;
			}catch (LargeNumberException e3) {
				// TODO: handle exception
				System.out.println(e3);
			//	continue ;
			}
			
		/*	sum = sum + n[i] ;  if we do not write continue than it will take all the numbers for addition instead of continue we just
			have to put else part on else if condition.*/
		}
		System.out.println("Addition of valid numbers : "+sum);
	}

}

@SuppressWarnings("serial")
class NegativeNumberException extends Exception
{
	/*String s1;
	public NegativeNumberException(String s2) { if we write like this than we get output as Negative number is not allow not like 
												gtu.NegativeNumberException : Negative number is not allow. In solution all program
												run by jdk and in jdk if we want to run from cmd than we have to remove package name
												so that here we get output without package name and also if we are using this method
												and run program then also we get output as  Negative number is not allow because we 
												are not calling super class constructor we are just giving value of string and printing
												using toString() method.(this is right concept why paper solver using this technique).
		// TODO Auto-generated constructor stub
		s1 = s2 ;
	}
	public String toString() {
		return (""+s1) ;
	}*/
	public NegativeNumberException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

@SuppressWarnings("serial")
class EvenlyDivisibleException extends Exception
{
	public EvenlyDivisibleException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}


@SuppressWarnings("serial")
class NumberRangeException extends Exception
{
	public NumberRangeException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
 @SuppressWarnings("serial")
class LargeNumberException extends Exception
{
	public LargeNumberException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}