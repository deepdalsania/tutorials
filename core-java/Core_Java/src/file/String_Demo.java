package file;

public class String_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* we can't use delete method in string class. and if we print string after any operation
			then it will give original string so string class is inmuchable(not changable).*/
		String s = new String("Deep BharatBhai Dalsania");
		String s1 = new String("Dalsania");
		String s2 = new String("BharatBhai");
		String s3 = new String("Deep BharatBhai Dalsania");
		
		System.out.println("1) Unicode :"+s.codePointAt(1));
		System.out.println("2) contains : "+s.contains("Deep"));
		System.out.println("3) contentEquals : "+s.contentEquals(s1));
		System.out.println("4) equalsIgnoreCase : "+s.equalsIgnoreCase(s3));
		System.out.println("5) getBytes : "+s.getBytes());
		System.out.println("6) compareToIgnoreCase : "+s.compareToIgnoreCase(s2));
		System.out.println("7) concat : "+s1.concat(s2));
		System.out.println("8) replace : "+s.replace('D', 'd'));
		System.out.println("9) toLowerCase : "+s1.toLowerCase());
		System.out.println("10)toUpperCase : "+s2.toUpperCase());
		
		System.out.println();
		System.out.println("After manipullation String s : "+s);
	}

}
