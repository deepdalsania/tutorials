package oops;

public class InterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().display();
		
		new Test1().disp();  //anonymous object new Test1()
		new Test1().display();
		/*t1.disp();
		t1.display();*
		
		/*Test2 t2 = new Test2();
		t2.display();
		t2.disp();
		Test3 t3 = new Test3();
		t3.dis();
		t3.disp();
		t3.display();*/
		
	}

}

interface Inter
{
	int i = 14; //value is constant means in java final.
	/*i = i + 4; we can't able to perform any operation to the final variable*/  
	void display();
}

interface Inter1
{
	int j = 10;
	void disp();
}



class Test implements Inter
{

	public void display() {
		System.out.println("Test class");
		System.out.println("i = "+i);
	}
	
}

class Test1 implements Inter1,Inter
{
	
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Test1 class");
		System.out.println("Addition is = "+(i+j));
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication is = "+(i*j));
	}
	
}

/*private class ABC{ private , protected is not allow access specifier for class only public ,default , abstract and final are permitted
	
}*/
/*private interface Test4{ only public , default , abstract are permitted
	
}*/
/*class t extends test,test1 //it is not possible to to extend two classes in java but it can be eliminate by using interface only

	
}*/

/*class Test2 implements Inter,Inter1 //using this we can eliminate multiple inheritance
{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inter Test2 class");
		System.out.println("i = "+i);
	}

	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Inter1 Test2 class");
		System.out.println("j = "+j);
	}
	
}*/

/*interface Inter2 extends Inter,Inter1 //also we can extends multiple interface like this
{
	int k = 4;
	void dis();
}

class Test3 implements Inter2
{

	public void dis() {
		// TODO Auto-generated method stub
		System.out.println("Inter2 Test3 class");
		System.out.println("k = "+k);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inter Test3 class");
		System.out.println("i = "+i);
	}

	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Inter1 Test3 class");
		System.out.println("j = "+j);
	}
	
}*/

/*class Test4  extends Test2 implements Inter
{
	public void disp(){
		
	}
}*/