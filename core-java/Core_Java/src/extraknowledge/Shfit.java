package extraknowledge;

public class Shfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -2, c = -2;
		int b = 7;
		
		System.out.println("a : "+Integer.toBinaryString(a));
		System.out.println("b : "+Integer.toBinaryString(b));
		
		System.out.println(b >> 2);
		
		System.out.println(b >>> 2);
	
		System.out.println("Before :"+Integer.toBinaryString(a));
		a = a >> 1;
		System.out.println("After : "+Integer.toBinaryString(a));
		System.out.println("Before :"+Integer.toBinaryString(c));
		c = c >>> 1;
		
		System.out.println("After :"+Integer.toBinaryString(c));
		//System.out.println(a);
	}

}
