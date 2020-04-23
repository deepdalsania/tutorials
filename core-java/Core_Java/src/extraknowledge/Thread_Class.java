package extraknowledge;

public class Thread_Class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		t.display();
		/*Thread4 t1 = new Thread4();
		t1.disp();*/
	}

}

class Thread 
{
//	abstract void disp();
	void display(){
		System.out.println("deep");
	}

	public static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
/*class Thread4 extends Thread
{

	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println("dalsania");
	}
	
}*/