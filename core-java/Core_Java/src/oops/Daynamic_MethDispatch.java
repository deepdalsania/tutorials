package oops;

import java.util.Scanner;

public class Daynamic_MethDispatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of A and B = ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		Super_Demo s1 = new Super_Demo();
		Sub_Demo s2 = new Sub_Demo();
		SubDemo_1 s3 = new SubDemo_1();
		
		Super_Demo r;
		
		r = s1;
		r.display(a, b);
		
		r = s2;
		r.display(a, b);
		
		r = s3;
		r.display(a, b);
		s.close();
	}

}
class Super_Demo
{
	void display(int a , int b)
	{
		System.out.println("Multiplication of SUPERCLASS variables = "+(a*b));
	}
}
class Sub_Demo extends Super_Demo
{
	void display(int a , int b)
	{
		System.out.println("Addition of SUBCLASS variables = "+(a+b));
	}
}	

class SubDemo_1 extends Sub_Demo
{
	void display(int a , int b)
	{
		if(a > b){
			System.out.println("Subtraction of SUBCLASS_1 variables = "+(a-b));
		}else{
			System.out.println("Subtraction is not possible");
		}
		
	}
}