package com;



public class Final_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 14;
		final int j = 10;
		// i = i + 5; it can't possible because final means constant
		new SupDemo().disp(i, j);
	}
}
final class SupDemo
{
	final void disp(int i , int j)
	{
		if(i == j || i > j){
			System.out.println("Condition is true");
		}else {
			System.out.println("Condition is false");
		}
		
	}
}
/*class SubDemo extends SupDemo 
{
	void display() not possible to use final method
	{
		
	}
}*/
/*class sub extends SupDemo we can't inherit final class
{
	
}*/