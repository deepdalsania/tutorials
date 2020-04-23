package multithreading;

public class Priority_DiffT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Prio_Thread1 pt = new Prio_Thread1();
		Prio_Thread2 pt1 = new Prio_Thread2();*/
		Thread t = new Thread(new Prio_Thread1());
		t.setName("Lower  Priority");
		Thread t1 = new Thread(new Prio_Thread2());
		t1.setName("Higher Priority");
		t1.setPriority(Thread.NORM_PRIORITY+3);
		//t.setPriority(Thread.NORM_PRIORITY-3);
		t.start();
		
		
		t1.start();
	}

}
class Prio_Thread1 implements Runnable
{

	 public void run() {
		// TODO Auto-generated method stub
	//	System.out.println("<< Odd Numbers in Ascending Order >>");
		for (int i = 1; i < 10; i=i+2) {
			try {
				System.out.println(Thread.currentThread().getName()+" "+"I = "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
}

class Prio_Thread2 implements Runnable
{

	 public void run() {
		// TODO Auto-generated method stub
		//System.out.println("<< Even Numbers in Descending Order >>");
		for (int j = 10; j > 1; j=j-2) {
			
			try {
				System.out.println(Thread.currentThread().getName()+" "+"J = "+j);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
	
