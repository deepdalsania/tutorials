package com;

public class Super_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new Derive(10,4).show();
	}

}
class Base
{
	int i , j;
	Base(int i, int j)
	{
		i = 50;
		j = 10;
		this.i = i;
		this.j = j;
		System.out.println("I = "+i+"\n"+"J = "+j);
		
	}
	void disp()
	{
		System.out.println("Sum = "+(i+j));
		
	}
}
class Derive extends Base
{

	Derive(int i , int j) {
	
		super(i,j);
		this.j = j;
	}
	void show(){
		System.out.println("Derive class");
		System.out.println("I = "+i);
		System.out.println("J = "+j);
		super.disp();
	}
}