package gtu;

public class Win15Q_1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]); /* at the run time we are passing arguments using command line so it is in string
												so if we want to addition of two than we have to compulsory convert that arguments 
												in double otherwise it can concate that arguments not add that argument so we have 
												to use wrapper class concept.*/
		double b = Double.parseDouble(args[0]);
		
		System.out.println("Addition of two double arguments using commad line is: "+(a+b));
	
	
	}

}
