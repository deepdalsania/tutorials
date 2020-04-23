package oops;

import java.util.Scanner;

public class Multilevel_Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.get_a();
		s.get_b();
		s.disp_a();
		s.disp_b();
		s.disp();
	}

}

class Mul
{
	protected int a;
	Scanner s = new Scanner(System.in);
	public void get_a() {
		System.out.println("Enter the value of a: ");
		a = s.nextInt();
	}
	public void disp_a() {
		System.out.println("Value of a is: "+a);
	}
}
class Mul_1 extends Mul
{
	protected int b;
	Scanner s = new Scanner(System.in);
	public void get_b() {
		System.out.println("Enter the value of b:");
		b = s.nextInt();
	}
	public void disp_b() {
		System.out.println("Value of b is: "+b);
	}
}
class Square extends Mul_1
{
	void disp(){
		System.out.println("Multiplication of "+" "+a+" "+"and"+" "+b+" "+"is :"+(a*b));
		System.out.println("Square of "+" "+a+" "+"is :"+(a*a));
		System.out.println("Square of "+" "+b+" "+"is :"+(b*b));
	}
	
	
}