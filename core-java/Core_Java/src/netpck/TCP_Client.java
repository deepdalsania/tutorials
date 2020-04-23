	package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TCP_Client {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1" , 150);
		PrintStream ps = new PrintStream(s.getOutputStream());
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<< Client to Server >>"+"\n Enter your name : ");
		ps.println(br.readLine());
		ps.flush();
		ps.close();
		br.close();
		s.close();
		
		
	}

}
