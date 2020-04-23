package multithreading;

public class Deadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		@SuppressWarnings("unused")
		User_1 u1 = new User_1(r1,r2);
		@SuppressWarnings("unused")
		User_2 u2 = new User_2(r1,r2);
		
	}

}
class Resource
{
	synchronized void Check1(Resource r2) throws InterruptedException
	{
		System.out.println("First Thread Start");
		Thread.sleep(1000);
		r2.Check2(this);
		System.out.println("First Thread Stop");
	}
	synchronized void Check2(Resource r1) throws InterruptedException
	{
		System.out.println("Second Thread Start");
		Thread.sleep(1000);
		r1.Check1(this);
		System.out.println("Second Thread Stop");

	}
	
}
class User_1 implements Runnable 
{
	Resource r1,r2;
	public User_1(Resource r1, Resource r2) {
		// TODO Auto-generated constructor stub
		this.r1 = r1;
		this.r2 = r2;
		Thread t = new Thread(this);
		t.start();
		
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			
				r1.Check1(r2);	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println();
		}
	}
	
}
class User_2 implements Runnable
{

	Resource r1,r2;
	public User_2(Resource r1, Resource r2) {
		// TODO Auto-generated constructor stub
		this.r1 = r1;
		this.r2 = r2;
		Thread t = new Thread(this);
		t.start();
		
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			
				r2.Check2(r1);	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
}