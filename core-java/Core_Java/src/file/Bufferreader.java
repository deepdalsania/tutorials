package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		int a,b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any two positive numbers= ");
		a = Integer.parseInt(br.readLine());// br.read()  reads a single character while its read whole string
		b = Integer.parseInt(br.readLine());
		
		if (a > b) {
			System.out.println("Subtraction of "  + a + " and " + b + " is : "+(a-b));
		}else{
			System.out.println("Addition of" + " " + a + " " + "and" + " " + b + " " + "is : "+(a+b));
		}
		
					
				
					
	}

}
