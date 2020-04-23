package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPServer {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1000);
		Socket s = ss.accept();
		System.out.println("<< Server to Client >>" + "\n << Conection Established... >> ");

		PrintStream ps = new PrintStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Value of A and B : ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		ps.println(a);
		ps.println(b);
		ps.flush();
		ps.close();
		br.close();
		ss.close();
		s.close();
	}

}
