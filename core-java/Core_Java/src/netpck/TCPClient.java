package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.Socket;

public class TCPClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1" , 1000);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("<< Client Side >> ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if (a > b) {
			System.out.println("Subtraction of "  + a + " and " + b + " is : "+(a-b));
		}else{
			System.out.println("Addition of" + " " + a + " " + "and" + " " + b + " " + "is : "+(a+b));
		}
		br.close();
		s.close();
		
		
	}

}
