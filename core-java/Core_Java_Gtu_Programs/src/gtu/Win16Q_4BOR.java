package gtu;

import java.util.Vector;

public class Win16Q_4BOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> buffer = new Vector<Integer>();
		int size = 4 ;
		Thread prodThread = new Thread(new Producer(buffer , size), "Producer");
		Thread consThread0 = new Thread(new Consumer(buffer , size), "Consumer0");
		prodThread.start();
		consThread0.start();
	}

}
class Producer implements Runnable
{
	private final Vector<Integer> buffer ;
	private final int SIZE ;
	public Producer(Vector<Integer> buffer, int size) {
		// TODO Auto-generated constructor stub
		this.buffer = buffer ;
		this.SIZE = size ;
	}
	public void run() {
		// TODO Auto-generated method stub
		int m ;
		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
				m = 0;
			}else {
				m = 1;
			}
			System.out.println("Produced: " + i + " For Consumer " + m);
			try {
				produce(i,m);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	private void produce(int i , int m) throws InterruptedException {
		
		while (buffer.size() == SIZE) {
			synchronized (buffer) {
				System.out.println("Queue is full "+ Thread.currentThread().getName() + " is waiting, size " + buffer.size());
			buffer.wait();
			}
		}
			synchronized (buffer) {
				buffer.add(i);
				buffer.notify();
		}
	}
	
}
class Consumer implements Runnable
{
	
	private final Vector<Integer> buffer ;
	
	@SuppressWarnings("unused")
	private final int SIZE ;
	
	
	public Consumer(Vector<Integer> buffer, int size) {
		// TODO Auto-generated constructor stub
		this.buffer = buffer ;
		this.SIZE = size ;
	}

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
	private int consume() throws InterruptedException {
		while (buffer.isEmpty()) {
			synchronized (buffer) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting, size " + buffer.size());
				buffer.wait();
				
			}
		}
		synchronized (buffer) {
			buffer.notifyAll();
			return buffer.remove(0);
		}
	}
	
}