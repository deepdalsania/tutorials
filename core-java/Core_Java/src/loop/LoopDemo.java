package loop;

public class LoopDemo {

	public static void main(String[] args) {
		
		int i[] = {5,10,20};
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	    for(int j : i){
	    	System.out.println(j);
	    }
		
	}
}
