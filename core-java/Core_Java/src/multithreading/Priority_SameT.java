package multithreading;
public class Priority_SameT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Prio_Thread pt = new Prio_Thread();
		Prio_Thread pt1 = new Prio_Thread();*/
		Thread t = new Thread(new Prio_Thread());
		t.setName("Lower  Priority");
	///	t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		Thread t1 = new Thread(new Prio_Thread());
		t1.setName("Higher Priority");
		t1.setPriority(t.getPriority()+5);
		t1.start();
	}

}
class Prio_Thread implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("<< Odd Numbers in Ascending Order >>");
		for (int i = 1; i < 10; i=i+2) {
			try {
				System.out.println(Thread.currentThread().getName()+" "+"I = "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
		//System.out.println("<< Even Numbers in Descending Order >>");
		for (int j = 10; j > 1; j=j-2) {
			
			try {
				System.out.println(Thread.currentThread().getName()+" "+"J = "+j);
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO: handle exception
				System.out.println(e1);
			}
		}
	}
	
}