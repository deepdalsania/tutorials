package collection;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(101, "ravi");
		treeMap.put(102, "harsh");
		treeMap.put(103, "keyur");
		treeMap.put(104, "rajesh");
		treeMap.put(102, "vijay");

		System.out.println(treeMap);
		
		treeMap.remove(104);
		System.out.println(treeMap);
		System.out.println("key set=" + treeMap.keySet());
		System.out.println("size =" + treeMap.size());
		System.out.println("empty =" + treeMap.isEmpty());

		System.out.println("frist =" + treeMap.firstKey());
		System.out.println("last =" + treeMap.lastKey());

	}

}
