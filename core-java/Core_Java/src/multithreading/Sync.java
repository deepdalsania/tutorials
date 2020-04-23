package multithreading;

public class Sync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< HOME ADDRESS IS >>");
		Call c = new Call();
		@SuppressWarnings("unused")
		Synchro s = new Synchro(c,"VRAJBHUMI");
		@SuppressWarnings("unused")
		Synchro s1 = new Synchro(c,"AMBAWADI PLOT");
		@SuppressWarnings("unused")
		Synchro s2 = new Synchro(c,"MADHAVANAGAR");
		@SuppressWarnings("unused")
		Synchro s3 = new Synchro(c,"MALIYA-HATINA");
		
}

}
class Call
{
	synchronized void disp(String s){
		System.out.print("\""+s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("\"");
	}
}
class Synchro implements Runnable
{
	Call c;
	String s;
	public Synchro(Call c, String s) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.s = s;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		c.disp(s);
		/*synchronized (c) {
			c.disp(s);
		}*/
	}
	
}