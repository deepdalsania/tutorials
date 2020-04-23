package com;

public class This_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThisDemo t = new ThisDemo(14,10,4); 
		new ThisDemo(14,10,4).display();
		new ThisDemo(10,4).show();
		
		
	}

}
class ThisDemo
{
	int i,j,k;
	ThisDemo(int i , int j , int k) //we can't plug private access specifier t oconstructor because it will be use i nmain method
	{
	/*i = i; it will not understand by the compiler that
		     L.H.S is class(instance) variable and R.H.S is local variable*/
		this.i = i; //it prevent instance hiding
		this.j = j;
		this.k = k;
		     
	}
	ThisDemo(int j, int k)
	{
		this.j = j;
		this.k = k;
	}
	void display()
	{
		System.out.println("Addition of all three variables= "+(i+j+k));
	}
	void show()
	{
		System.out.println("Multiplication = "+(j*k));
	}
}