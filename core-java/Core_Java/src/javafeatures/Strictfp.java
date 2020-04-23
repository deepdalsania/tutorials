package javafeatures;

public class Strictfp {

	public strictfp double avg() {
		double n1 = 10e+10 , n2 = 6e+08;
		System.out.println("Addition is : "+ (n1+n2));
		return ((n1+n2)/2);
	}
	public static strictfp void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average is : "+new Strictfp().avg());
	}

}
