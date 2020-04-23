package gtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Winter16Q3_b_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9927);
		Socket socket = serverSocket.accept();
		System.out.println("Connection Established...");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("Date and Time When Client Request : " + new Date());
		System.out.println("<< Server Side >> " + "\n Received Data is : " + bufferedReader.readLine().trim());
		bufferedReader.close();
		serverSocket.close();
		socket.close();
	}
}
