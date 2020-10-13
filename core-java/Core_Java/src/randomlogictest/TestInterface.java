package test;

public class TestInterface {
public static void main(String[] args) {
//	new Test().i=20;
	new Test().disp();
}
}
interface Inter{
	void disp();
}
class Test implements Inter{

		int i = 10;
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("I = "+i);
	}
	
}