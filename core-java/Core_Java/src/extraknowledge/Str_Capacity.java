package extraknowledge;

public class Str_Capacity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Deep     Dalsania");
		StringBuffer s = new StringBuffer("deep dalsania");
		System.out.println(s1.length());
		System.out.println(s.capacity());
		s.ensureCapacity(30);
		System.out.println(s.capacity());
		
		
	}

}
