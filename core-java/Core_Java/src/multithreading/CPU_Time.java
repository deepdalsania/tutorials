package multithreading;

public class CPU_Time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< MORE PRIORITY THREAD HAS MORE CPU TIME? JUSTIFY YOUR ANSWER. >>");
		CPU c = new CPU();
		CPU1 c1 = new CPU1();
		c.setName("T1");
		c1.setName("T2");
		c.setPriority(10);
		c1.setPriority(1);
		c.start();
		c1.start();
	}

}
class CPU extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time_s = System.currentTimeMillis();
		
		int  i = 0;
		for(; i < 1000000;){
			i++;
		}
		long time_e = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+" Execution Time : "+(time_e - time_s));

	}
}
class CPU1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time_s = System.currentTimeMillis();
		
		int  i = 0;
		for(; i < 1000000;){
			i++;
		}
		long time_e = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+" Execution Time : "+(time_e - time_s));

	}
}