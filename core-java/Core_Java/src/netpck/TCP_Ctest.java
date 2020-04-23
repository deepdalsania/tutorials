package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_Ctest {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 654);
		PrintStream ps = new PrintStream(socket.getOutputStream());
		System.out.println("<<Client to server>>" + "\nEnter Your Name : ");
		ps.println(new BufferedReader(new InputStreamReader(System.in)).readLine());
		socket.close();
		ps.flush();
		ps.close();

	}

}
