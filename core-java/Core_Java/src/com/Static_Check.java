package com;

public class Static_Check {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.disp(15,20);
	}

}
class StaticDemo
{
	static int i = 10,j=4;
//	static int j = 4;
	
	static void disp(int i , int j){
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
	static
	{
		i = i * 2;
		j = j + 2;
		System.out.println("Value of i in Static Block =  "+i);
		
		System.out.println("Value of j in Static Block =  "+j);
	}
}