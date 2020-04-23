package utilpck;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Collection_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(); // output in ascending order
		tm.put('A', 10);
		tm.put('C', 20);
		tm.put('D', 30);
		tm.put('B', 40);
		System.out.println("TreeMap : " + tm);
		System.out.println(tm.get('D'));
		HashMap<String, Long> hm = new HashMap<String, Long>();// output in passed order
		hm.put("D", 8000388859L);
		hm.put("B", 9909059616L);
		hm.put("A", 9106708024L);
		hm.put("C", 9737274225L);
		System.out.println("HashMap : " + hm);
		System.out.println(hm.get("DD"));

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(); // output in passed order
		lhm.put("D", 8000);
		lhm.put("B", 9909);
		lhm.put("A", 9106);
		lhm.put("C", 9737);
		System.out.println("LinkedHashMap : " + lhm);
		System.out.println(lhm.get("Deep"));

		Hashtable<String, Long> ht = new Hashtable<String, Long>(); // not even in passed order
		ht.put("AshutoshSir", 6325897412L);
		ht.put("RaviSir", 9909654987L);
		ht.put("NikhilSir", 9106321654L);
		ht.put("BhuatikSir", 9737789526L);
		ht.put("Dhavalbhai", 9638527410L);
		System.out.println("Hashtable : " + ht);

		System.out.println("Elements and Keys are : ");
		Enumeration<String> e = ht.keys();

		while (e.hasMoreElements()) {
			Object o = (Object) e.nextElement();
			System.out.println(o);
			System.out.println(ht.get(o));
		}

	}

}
