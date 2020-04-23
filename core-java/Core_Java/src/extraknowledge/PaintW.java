package extraknowledge;

public class PaintW {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("W");
		int n = 4;
		int i,j; //see draw M like that create one table 5*5 and draw w and put that condition on if else
		for (i = 1; i < 5; i++) {
			for ( j = 1; j <= i; j++) {
				addspace();
			}
			System.out.println("W");
		}
		for (i = 1; i < 3 ; i++) {
			for (j = 1; j >= n+i ; j--) {
				addspace();
				
			}
			System.out.println("W");
		}
		/*for(i = 5; i > 1 ; i--){
			for(j = 1; j <=n+i; j++){
				addspace();
			}
			System.out.print("W");
		}*/
		
	}
	public static void addspace(){
		System.out.print(" ");
	}

}
