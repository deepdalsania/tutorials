package extraknowledge;

public class StringStorageAndEquality {
	public static void main(String[] args) {
		/*
		 * Reference :
		 * https://www.ntu.edu.sg/home/ehchua/programming/java/J3d_String.html
		 */
		String s1 = "Hello"; // String literal
		String s2 = "Hello"; // String literal
		String s3 = s1; // same reference
		String s4 = new String("Hello"); // String object
		String s5 = new String("Hello"); // String object

		System.out.println(s1 == s1); // true, same pointer
		System.out.println(s1 == s2); // true, s1 and s1 share storage in common pool
		System.out.println(s1 == s3); // true, s3 is assigned same pointer as s1
		System.out.println(s1.equals(s3)); // true, same contents
		System.out.println(s1 == s4); // false, different pointers
		System.out.println(s1.equals(s4)); // true, same contents
		System.out.println(s4 == s5); // false, different pointers in heap
		System.out.println(s4.equals(s5)); // true, same contents
	}
}
