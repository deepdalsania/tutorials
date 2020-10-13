package test;

import java.util.LinkedList;

public class Test_LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("f");
		ls.add("g");
		ls.add("h");
		System.out.println("First op = " + ls);
		ls.remove("e");
		ls.remove(2);
		System.out.println("Second op = " + ls);
		ls.removeFirst();
		ls.removeLast();
		System.out.println("Third op = " + ls);
		ls.set(2, ls.get(2) + " Change");// if ls.set(2," Change"); then it will replace with f
		System.out.println("Fourth op = " + ls);
	}

}
