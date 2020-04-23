package file;

public class Stringbuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder("Parimal Pambhar");
		StringBuilder s2 = new StringBuilder("Kishan Thumar");
		StringBuilder s3 = new StringBuilder("Jhanvi Ghediya");
		StringBuilder s4 = new StringBuilder("Deep Dalsania");
		
		System.out.println("1)capacity : "+s1.capacity());
		s1.ensureCapacity(40);
		System.out.println("capacity after ensuring : "+ s1.capacity());
		System.out.println("2)indexOf : "+s2.indexOf("a"));//if entered element is not there then it will give -1
		System.out.println("3)append : "+s4.append("Bharatbhai"));
		System.out.println("4)insert : "+s2.insert(13, " Sureshbhai"));
		System.out.println("5)reverse : "+s1.reverse());
		System.out.println("6)subSequence : "+s2.subSequence(0, 8));
		System.out.println("7)length : "+s3.length());
		System.out.println("8)deleteCharAt : "+s2.deleteCharAt(8));
		System.out.println("9)charAt : "+s4.charAt(5));
		System.out.println("10)substring : "+s4.substring(3, 7));
		System.out.println("after manipulation String s1 : "+s1);
	}

}
