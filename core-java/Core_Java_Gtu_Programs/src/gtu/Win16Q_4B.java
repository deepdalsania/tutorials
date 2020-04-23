package gtu;



public class Win16Q_4B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		int y = x - 50 ;
		@SuppressWarnings("unused")
		int z = x - y ;
		Thread t1 = new Thread(new Prime1(x));
		Thread t2 = new Thread(new Prime2(y,x));
		
		t1.start();
		
		t2.start();
	}

}
class Prime1 implements Runnable
{
	int flag1 = 0 , p ;
	
	public Prime1(int q) {
		// TODO Auto-generated constructor stub
		  p = q ;
	}
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			for(int i=1; i<p;i++){ // p/2 check
				
				for (int j = 2; j < i; j++) {
					if( i % j == 0){
						flag1 = 1;
					//	break;
					}
					
				}
				if(flag1==0){
					System.out.println("Prime No. + "+i);
				}
				if (flag1 == 1){
					System.out.println("Not Prime No. = "+i);
					flag1 = 0 ;
				}
				
				Thread.sleep(1000);
			}
				
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
class Prime2 implements Runnable
{
	int flag2 = 0 , n1 , n2 ;
	public Prime2(int m1 , int m2) {
		// TODO Auto-generated constructor stub
		n1 = m1 ;
		n2 = m2 ;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			for(int i=n1; i<n2;i++){ // p/2 check
				
				for (int j = 2; j < i; j++) {
					if( i % j == 0){
						flag2 = 1;
					//	break;
					}
					
				}
				if(flag2 == 0){
					System.out.println("Prime No. -> "+i);
				}
				if (flag2 == 1){
					System.out.println("Not Prime No. :- "+i);
					flag2 = 0 ;
				}
				
				Thread.sleep(1000);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}