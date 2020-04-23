package oops;

import java.util.Scanner;

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.disp();
		d.get();
		d.show();
	}

}
abstract class Check
{
		
	abstract void get();	
	abstract void show();
		
	void disp()
	{
		System.out.println("Check Class");
	}
}
class Demo1 extends Check
{
	int a , b;
	Scanner s = new Scanner(System.in);
	void get() {
		System.out.println("Enter the value of A and B = ");
		a = s.nextInt();
		b = s.nextInt();
		
	}
	void show()
	{
		if(a > b){
			System.out.println("Subtraction is = "+(a-b));
		}else {
			System.out.println("Subtraction isnot possible");
		}
		
	}

	
	
}