package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Stest {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(654);
		Socket s = ss.accept();
		System.out.println("Connection Established...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Received Message is: " + br.readLine());
		br.close();
		ss.close();
		s.close();
	}

}
