package file;

public class Wrapper_Class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Boolean b = new Boolean("true");
		System.out.println("Boolean = "+b);
		System.out.println("Size of Boolean ="+b.SIZE);*/
		/*write any 4 methods in each*/
		
		System.out.println("<< Byte >>");
		Byte b1 = new Byte((byte)1);
		Byte b2 = new Byte((byte)2);
		System.out.println("Value = "+b1);
		System.out.println("Size of Byte = "+Byte.SIZE);
		System.out.println("Maximum value of Byte = "+Byte.MAX_VALUE);
		System.out.println("Minimum value of Byte = "+Byte.MIN_VALUE);
		System.out.println("Both values are Equal = "+b1.equals(b2));
		System.out.println("Compare both value = "+b1.compareTo(b2));

		System.out.println("<< Short >>");
		Short s1 = new Short((short)32000);
		Short s2 = new Short((short)32000);
		System.out.println("Value = "+s1);
		System.out.println("Size of Short = "+Short.SIZE);
		System.out.println("Maximum value of Short = "+Short.MAX_VALUE);
		System.out.println("Minimum value of Short = "+Short.MIN_VALUE);
		System.out.println("Both values are Equal = "+s1.equals(s2));
		System.out.println("Compare both value = "+s1.compareTo(s2));
		
		
		System.out.println("<< INTEGER >>");
		Integer i1 = new Integer(500);
		Integer i2 = new Integer(1000);
		System.out.println("Value = "+i1);
		System.out.println("Size of Integer = "+Integer.SIZE);
		System.out.println("Maximum value of Integer = "+Integer.MAX_VALUE);
		System.out.println("Minimum value of Integer = "+Integer.MIN_VALUE);
		System.out.println("Both values are Equal = "+i1.equals(i2));
		System.out.println("Compare both value = "+i1.compareTo(i2));// if first one is bigger tahn second than output is 1 otherwise -1.
	
		System.out.println("<< Long >>");
		Long l1 = new Long(32000);
		Long l2 = new Long(3200);
		System.out.println("Value = "+l1);
		System.out.println("Size of Long = "+Long.SIZE);
		System.out.println("Maximum value of Long = "+Long.MAX_VALUE);
		System.out.println("Minimum value of Long = "+Long.MIN_VALUE);
		System.out.println("Both values are Equal = "+l1.equals(l2));
		System.out.println("Compare both value = "+l1.compareTo(l2));
		
		
		System.out.println("<< CHARACTER >>");
		Character c1 = new Character('a');
		Character c2 = new Character('A');
		System.out.println("Value = "+c1);
		System.out.println("Size of Character = "+Character.SIZE);
		System.out.println("Maximum value of Character = "+(Character.MAX_VALUE+0));
		System.out.println("Minimum value of Character = "+(Character.MIN_VALUE-0));
		System.out.println("Both values are Equal = "+c1.equals(c2));
		System.out.println("Compare both value = "+c1.compareTo(c2));
		
		System.out.println("<< FLOAT >>");
		Float f1 = new Float(5.6f);
		Float f2 = new Float(3.4f);
		System.out.println("Value = "+f1);
		System.out.println("Size of Float = "+Float.SIZE);
		System.out.println("Maximum value of Float = "+Float.MAX_VALUE);
		System.out.println("Minimum value of Float = "+Float.MIN_VALUE);
		System.out.println("Both values are Equal = "+f1.equals(f2));
		System.out.println("Compare both value = "+f1.compareTo(f2));
		
		System.out.println("<< DOUBLE >>");
		Double d1 = new Double(4.10);
		Double d2 = new Double(4.10);
		System.out.println("Value = "+d1);
		System.out.println("Size of Double = "+Double.SIZE);
		System.out.println("Maximum value of Double = "+Double.MAX_VALUE);
		System.out.println("Minimum value of Double = "+Double.MIN_VALUE);
		System.out.println("Both values are Equal = "+d1.equals(d2));
		System.out.println("Compare both value = "+d1.compareTo(d2));
	
		Boolean b3 = new Boolean("true");
		Boolean b4 = new Boolean("false");
		System.out.println("Boolean = "+b3);
	/*	System.out.println("Size of Boolean ="+b3.SIZE);
		System.out.println("Maximum value of Boolean = "+Boolean.MAX_VALUE);
		System.out.println("Minimum value of Boolean = "+Boolean.MIN_VALUE);*/
		System.out.println("Both values are Equal = "+b3.equals(b4));
		System.out.println("Compare both value = "+b3.compareTo(b4));
	}

}
