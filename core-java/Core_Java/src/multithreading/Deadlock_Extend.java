package multithreading;

public class Deadlock_Extend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res r1 = new Res();
		Res r2 = new Res();
		User_3 u3 = new User_3(r1,r2);
		u3.start();
		User_4 u4 = new User_4(r1,r2);
		u4.start();
	}

}
class Res
{
	void Check1(Res r2) throws InterruptedException
	{
		System.out.println("First Thread Start");
		Thread.sleep(1000);
		r2.Check2(this);
		System.out.println("First Thread Stop");
	}
	 void Check2(Res r1) throws InterruptedException
	{
		System.out.println("Second Thread Start");
		Thread.sleep(1000);
		r1.Check1(this);
		System.out.println("Second Thread Stop");

	}
	
}
class User_3 extends Thread
{
	Res r1,r2;
	public User_3(Res r1, Res r2) {
		// TODO Auto-generated constructor stub
		this.r1 = r1;
		this.r2 = r2;

		
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized (r1) {
				r1.Check1(r2);	
			}
		//	r1.Check1(r2);	
			
				
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println();
		}
	}
	
}
class User_4 extends Thread
{

	Res r1,r2;
	public User_4(Res r1, Res r2) {
		// TODO Auto-generated constructor stub
		this.r1 = r1;
		this.r2 = r2;
	
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized (r2) {
				r2.Check2(r1);		
			}
		//	r2.Check2(r1);	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
}