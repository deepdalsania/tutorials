package gtu;
//non static nested class
public class NestedClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer().disp(); 
	}

}
class Outer{
	int o_i = 10;
	void disp(){
	Internal inter = new Internal();
	inter.show();
	System.out.println("Internal I = "+inter.i_i); /*outer class can access iner class property with their object only
	either nested class is static or non-static*/
	}
	
	class Internal{
		int i_i = 4;
		void show(){
			System.out.println("Outer I = "+o_i); /* inner class can access outer class property without the help of thier
			object only*/
		}
	}
}

//static nested class 
/*public class NestedClass_Demo {
	public static void main(String[] args) {
		new Outer().disp();
	}
}

class Outer{
	int o_i = 10;
	void disp(){
	Internal inter = new Internal();
	inter.show();
	System.out.println("Internal I = "+inter.i_i); /*outer class can access iner class property with their object only
													either nested class is static or non-static*/
	//}
	
	/*static class Internal{
		int i_i = 4;
		void show(){
			System.out.println("Outer I = "+new Outer().o_i); /* inner class can access outer class property with the help of thier
																object only*/
		//}
	//}
//}