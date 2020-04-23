package javafeatures;

public class VarLenArg {

	/**
	 * @param args
	 */
	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("no arguments passed");
			return;
		}
	double result = numbers[0] ;
	
	for (int i = 1; i < numbers.length; i++) {
		if (numbers[i] > result) {
			result = numbers[i];
		}
		System.out.println("max  : "+result);
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMax(1,2,3,4,5.5);
		printMax(new double[]{1,2,3});
	}

}
