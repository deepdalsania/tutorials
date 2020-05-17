package file;

public class Stringbuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*use in multi threading */
		StringBuffer s1 = new StringBuffer("Welcome to JAVA");
		StringBuffer s2 = new StringBuffer("I Love JAVA");
		StringBuffer s3 = new StringBuffer("      JAVA      ");
		StringBuffer s4 = new StringBuffer("Welcome JAVA");
		Stringbuffer s5 = new Stringbuffer();
		
		System.out.println("1)capacity : "+s1.capacity());
		s1.ensureCapacity(32);
		System.out.println("capacity after ensuring : "+ s1.capacity());
		System.out.println("2)indexOf : "+s2.indexOf("A"));//if entered element is not there then it will give -1
		System.out.println("3)append : "+s3.append("is good language"));
		System.out.println("4)insert : "+s4.insert(8, "to "));
		System.out.println("5)reverse : "+s1.reverse());
		System.out.println("6)subSequence : "+s2.subSequence(0, 8));
		System.out.println("7)length : "+s1.length());
		System.out.println("8)deleteCharAt : "+s2.deleteCharAt(8));
		System.out.println("9)charAt : "+s4.charAt(5));
		System.out.println("10)substring : "+s4.substring(3, 7));
	
		System.out.println("after manipulation String s1 : "+s1);
	}

}
