package multithreading;



public class Thread_Method {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	Prio_Thread1 pt = new Prio_Thread1();
		Prio_Thread2 pt1 = new Prio_Thread2();*/
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread1());
		Thread t3 = new Thread(new Thread1());
		/*t1.setName("Lower  Priority");
		t2.setName("Norm Priority");
		t3.setName("Higher Priority");*/
	//	t1.setPriority(Thread.NORM_PRIORITY+3);
		
		//t.setPriority(Thread.NORM_PRIORITY-3);
		t1.start();
		t1.join(20000);// start second thread after waiting 20 secs or if it's dead.	
		t2.start();
		t1.join(20000);
		t3.start();
		t1.join(20000);
		t2.join(20000);
		t3.join(20000);
		
		
	//	System.out.println(t.getName()+" Thread is alive  : "+t.isAlive());
		//t1.start();

//		System.out.println(t1.getName()+" Thread is alive  : "+t1.isAlive());
		
	
	}

}
class Thread1 implements Runnable
{

	 public void run() {
		// TODO Auto-generated method stub
	//	System.out.println("<< Odd Numbers in Ascending Order >>");
		/*for (int i = 1; i < 10; i=i+2) {
			try {
				System.out.println(Thread.currentThread().getName()+" "+"I = "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}*/
		 System.out.println("Thread Started : "+Thread.currentThread().getName());
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Thread Ended : "+Thread.currentThread().getName());
	 }
}

/*class Thread2 implements Runnable
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

}*/
	
