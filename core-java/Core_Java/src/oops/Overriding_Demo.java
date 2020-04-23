package oops;

public class Overriding_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubDemo s = new SubDemo();
		s.display(10,20);
	}

}
class SuperDemo
{
	void display(int a , int b)
	{
		System.out.println("Multiplication of SUPERCLASS variables = "+(a*b));
	}
}
class SubDemo extends SuperDemo
{
	void display(int a , int b)
	{
		System.out.println("Multiplication of SUBCLASS variables = "+(a*b));
	}
}