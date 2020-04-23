package loop;

public class While_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("w");
		while(i<10){
			System.out.println(i);
			i=i+2;
		}
		
		System.out.println("d");
		do {
			System.out.println(i);
			i++;
		} while (i<10);
		
	}

}
