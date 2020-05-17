package extraknowledge;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {

		// it is for factorial
		/*
		 * BigInteger bi1 = new BigInteger("1"); Scanner s = new Scanner(System.in);
		 * System.out.println("Enter number for factorial : "); int n = s.nextInt();
		 * s.close(); for (int i = 2; i < n; i++) { bi1 =
		 * bi1.multiply(BigInteger.valueOf(i)); } System.out.println("Factorial is : " +
		 * bi1);
		 */
		// all other common methods are same as BigDecimal
		BigInteger bi2 = new BigInteger("13773737373");
	    // When certainty is positive, it will check number for prime or composite 
		System.out.println("Certanity 1 : " + bi2.isProbablePrime(1000));
		// When certainty is zero, it is always true
		System.out.println("Certanity 0 : " + bi2.isProbablePrime(0));
		// When certainty is negative, it is always true
		System.out.println("Certanity -1 : " + bi2.isProbablePrime(-1));

	}
}
