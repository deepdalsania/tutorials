package extraknowledge;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("22356123541.5254125");
		BigDecimal bd2 = new BigDecimal("1114551.56236523");
		BigDecimal bd3 = new BigDecimal("1210112.65632");
		System.out.println("Addition : " + bd1.add(bd2));
		System.out.println("Subtraction : " + bd1.subtract(bd2));
		System.out.println("Multiplicaiton : " + bd1.multiply(bd2));
		System.out.println("Division : " + bd1.divide(bd2, BigDecimal.ROUND_FLOOR));
		System.out.println("Power of 2 : " + bd1.pow(2, MathContext.UNLIMITED));
		System.out.println("Negate : " + bd1.negate());
		System.out.println("10 as BD Constant : " + BigDecimal.TEN);
		String s1 = "123456789.123456789";
		BigDecimal bd4 = bd3.add(new BigDecimal(s1));
		System.out.println("str to bd : " + bd4);
		double val = 123456789.123456789;
		BigDecimal bd5 = bd3.add(BigDecimal.valueOf(val));
		System.out.println("double to bd : " + bd5);
		double d1 = bd3.doubleValue();
		System.out.println("bd to double : " + d1);
		String s2 = bd3.toPlainString();
		String s3 = bd3.toEngineeringString();
		String s4 = bd3.toString();
		System.out.println("bd to PlainString : " + s2);
		System.out.println("bd to EngineeringString : " + s3);
		System.out.println("bd to String : " + s4);
		// compareTo returns -1(less than), 0(Equal), 1(greater than) according to
		// values.
		System.out.println("Comparision :" + bd1.compareTo(bd2));
		System.out.println("Equality : " + bd2.equals(bd3));
		System.out.println("Max : " + bd4.max(bd3));

	}
}
