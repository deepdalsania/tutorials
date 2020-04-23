package utilpck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al = new ArrayList<>(); // output in passed order
		al.add('A');
		al.add('C');
		al.add('D');
		al.add('B');

		System.out.println("ArrayList : " + al);
		Iterator<Character> it = al.iterator();
		System.out.println("<< ARRAYLIST >>" + "\nElements are : ");
		while (it.hasNext()) {
			Object a = (Object) it.next();
			System.out.println(a);
		}
		// System.out.println("Array = "+al.listIterator());

		LinkedList<Character> ls = new LinkedList<>(); // output in passed order
		// System.out.println("LinkedList ="+ls.listIterator());
		ls.add('A');
		ls.add('C');
		ls.add('D');
		ls.add('B');
		System.out.println("LinkedList : " + ls);
		/*
		 * System.out.println("Elements are : "); for (Object o : ls) {
		 * System.out.println(o); }
		 */
		TreeSet<Character> t = new TreeSet<>(); // oupt in ascending order
		t.add('A');
		t.add('C');
		t.add('D');
		t.add('B');
		System.out.println("TreeSet : " + t);
		System.out.println("<< TREESET >>" + "\nElements are : ");
		for (Object o : t) {
			System.out.println(o);
		}

		HashSet<Integer> hs = new HashSet<>(); // set duplication not allow and output not in passed order
		hs.add(1);
		hs.add(3);
		hs.add(4);
		hs.add(2);
		hs.add(1);
		System.out.println("HashSet : " + hs);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // in passed order
		lhs.add(1);
		lhs.add(3);
		lhs.add(4);
		lhs.add(2);
		lhs.add(1);
		System.out.println("LinkedHashSet : " + lhs);
		for (Iterator<Integer> i = lhs.iterator(); i.hasNext();) {
			Object o = (Object) i.next();
			System.out.println(o);
		}
	}
}
