package utilpck;

import java.util.Random;

public class Random_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println("<< 10 Random Number between 0 to 10 >>");
        System.out.print("[");
        for(int i = 0; i < 10; i++)
        {
        	System.out.print(r.nextInt(10)+" , ");
        }
        System.out.println("]");

        
        System.out.println("Integer : "+r.nextInt(10));
        System.out.println("Boolean : "+r.nextBoolean());
        System.out.println("Long : "+r.nextLong());
        System.out.println("Double : "+r.nextDouble());
        System.out.println("Float :"+r.nextFloat());
        System.out.println("Gaussian : "+r.nextGaussian());
          
      //  System.out.println(r.nextInt());
        
         
          
      
      
      /*long seed = 95;
      random.setSeed(seed);*/
	}

}
