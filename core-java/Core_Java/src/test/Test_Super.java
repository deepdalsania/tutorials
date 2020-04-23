package test;


public class Test_Super {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Derive(10).show();
	}

}
class Base{
	int i;
	public Base(int i){
		this.i = i;
		System.out.println("I = "+i);
	}
	int j;
	void disp(){
		System.out.println("This is base class and value of J : "+j);
	}
}
class Derive extends Base{

	public Derive(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	void show(){
		super.j=10;
		super.disp();
		//super.j=10; if we define like thAT THEN WE GET J = 0
	}
}