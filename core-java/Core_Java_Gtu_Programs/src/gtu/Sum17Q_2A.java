package gtu;

public class Sum17Q_2A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:"+ args[i]);
		}
		String[] a = new String[args.length];
		//System.arraycopy(args, args.length - 1, a, a.length - 1, args.length);
		for (int i = args.length - 1; i >=0 ; i--) {
			a[i] = args[i];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("a[" + i + "]:"+ a[i]);
		}
	}
	
}
