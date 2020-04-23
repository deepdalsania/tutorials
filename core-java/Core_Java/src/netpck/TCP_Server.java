package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_Server {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(150);
		Socket s = ss.accept();
		System.out.println("Connection Established...");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("<< Server Side >> " + "\n Received Data is : " + br.readLine());
		br.close();
		ss.close();
		s.close();

	}

}
