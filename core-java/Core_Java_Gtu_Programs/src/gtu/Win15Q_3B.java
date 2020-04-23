package gtu;

public class Win15Q_3B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			if (!(args[i].charAt(0)>= 65 && args[i].charAt(0)<=90)) {
				System.out.println("Eroor: String " + args[i] + " does not begin with uppercase letter");
				break; //if entered string isnot strat from uppercase then give an error message and terminate immediately
			}
			
		}
	}

}
