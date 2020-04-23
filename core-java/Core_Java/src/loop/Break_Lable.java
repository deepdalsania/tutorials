package loop;

public class Break_Lable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			loop : for (int j = 1; j <= 5; j++) {
				System.out.print(i+" ");
				if(j==5){
					break loop;
				}
			}
		}
	}

}
