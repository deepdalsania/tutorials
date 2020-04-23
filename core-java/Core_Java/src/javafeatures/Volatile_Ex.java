package javafeatures;

public class Volatile_Ex {
	
	Thread t = new Thread(new MyRunnable());
	
}


class MyRunnable implements Runnable {
	   private volatile boolean active;
	   public void run() {
	      active = true;
	      while (active) {    
	      }
	   }
	   public void stop() {
	      active = false;  
	   }
}