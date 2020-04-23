package utilpck;

import java.util.Vector;

public class Vector_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v = new Vector<>(); // vector<> here <> means generic datatype it means run time it will decide
											// which datatype
		// data is passed. if we want to pass any specific data type then it is allow.
		/*
		 * Vector v1 = new Vector(); v1.add(14);
		 */
		System.out.println("1)capacity : " + v.capacity());
		v.ensureCapacity(30);
		System.out.println("After ensuring capacity is : " + v.capacity());
		v.add(12);
		v.add(10.5f);
		v.add('b');
		v.add("balajiinfotech");
		System.out.println("Vector : " + v);
		/*
		 * alternate option Integer i = new Integer(10); v.addElement(i);
		 * System.out.println(v);
		 */
		System.out.println("2)indexOf : " + v.indexOf('d'));
		System.out.println("3)contains : " + v.contains(12));
		System.out.println("4)size : " + v.size());
		System.out.println("5)toString : " + v.toString());
		// System.out.println("6) : "+v.copyInto()); If interger array are there and we
		// want to copy vector element in that array then this
		// method is used.
		/*
		 * v1.addAll(v); for (Object s : v) { System.out.println(s); }
		 */
		System.out.println("6)elementAt : " + v.elementAt(2));
		System.out.println("7)firstElement : " + v.firstElement());
		System.out.println("8)get : " + v.get(3));
		System.out.print("9)insertElementAt : ");
		v.insertElementAt("zeronsec", 3);
		System.out.println(v);
		System.out.print("10)set : ");
		v.set(4, "balajiinfosec");
		System.out.println(v);
		// clear , remove , clone , trimToSize , containsall
	}

}
