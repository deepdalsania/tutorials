package dataconversion;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("0001", 2));
		System.out.println(Integer.toBinaryString(10));
		System.err.println(Integer.parseInt("a",16));
	}
}
