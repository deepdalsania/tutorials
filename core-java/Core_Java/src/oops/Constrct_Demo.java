package oops;

import java.text.DecimalFormat;

public class Constrct_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c1 = new Complex();
		Complex c2 = new Complex(2.34f,3.14f);
		Complex c3 = new Complex();
		c3 = c3.add(c1,c2);
		System.out.print("C1 = ");c1.disp();
		System.out.print("C2 = ");c2.disp();
		System.out.print("C3 = "); c3.disp();
	}

}
class Complex
{
	DecimalFormat f = new DecimalFormat("##.00");
	
	float r , i;
	Complex(){
		r = i = 0;
	}
	Complex(float a){
		r = a;
		i = 0;
	}
	Complex(float a , float b){
		r = a;
		i = b;
	}
	Complex add(Complex c1 , Complex c2){
		
		Complex c3 = new Complex();
		c3.r = c1.r + c2.r;
		c3.i = c1.i + c2.i;
		
		return c3;
	}
	void disp(){
		System.out.println(f.format(r)+ " "+ "+j" + " " +f.format(i));
	}
}