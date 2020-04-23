package multithreading;

import java.io.IOException;
import java.util.Scanner;

public class ChatApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Sender se = new Sender();
		@SuppressWarnings("unused")
		Chat d = new Chat(se);
		@SuppressWarnings("unused")
		Chat1 d1 = new Chat1(se);
	
	}

}
class Sender
{
	//InputStreamReader i = new InputStreamReader(System.in);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner s = new Scanner(System.in);
	
	String s1;
	String s2;
	int i = 0;
	/*Sender() throws IOException{
System.out.println("Enter the positive number for conversation :  ");
	
	 n = s.nextInt();
	}*/
	synchronized void disp(Sender se) throws IOException{
		
		try {
				
					while (i >= 0) {
						if (i != 0) {
							System.out.println("Received Message is : "+s2);
						}
						
						System.out.println("Sender Enter Your Message : ");
						s1 = s.nextLine();
						wait();
						notify();
						i++;
					}
						
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
	}
	synchronized void display(Sender se ) throws InterruptedException, IOException {
		
		while (!s1.equalsIgnoreCase("Bye") && !s1.equalsIgnoreCase("Jsk")){
			System.out.println("Received Message is : "+s1);
			System.out.println("Receiver Enter Your Message  : ");
			s2 = s.nextLine();
			notify();
			wait();
		}
	}
}
class Chat implements Runnable
{

	Sender se;
	public Chat(Sender se) {
	
		this.se = se;
		Thread t = new Thread(this);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}

	public void run() {
		try {
			se.disp(se);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}
	}
}
class Chat1 implements Runnable
{
	Sender se;
	public Chat1(Sender se) {
		this.se = se;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		try {
		se.display(se);
		} catch (InterruptedException e) {
		System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}	
	}
	
}


