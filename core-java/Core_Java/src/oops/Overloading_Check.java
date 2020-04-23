package oops;

public class Overloading_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload o = new Overload();
		o.add(10,20);
		o.add(10.4f,20.5f);
		o.add(10,20,10.4f);
	}

}
class Overload
{
	void add(int a, int b)
	{
		System.out.println("Addition of two integer number is= "+(a+b));
		
	}
	void add(float a, float b)
	{
		System.out.println("Addition of two float number is= "+(a+b));
		
	}
	void add(int a , int b , float c)
	{
		System.out.println("Addition of two integer number and one float is= "+(a+b+c));
	}
}