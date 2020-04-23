package gtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Summer16Q_2b_Server {

	 
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9923);
		Socket socket = serverSocket.accept();
		System.out.println("Connection Established...");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string = bufferedReader.readLine();
		char c[] = string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <=90) {
				c[i] = (char) (c[i] + 32);
			} else {
				c[i] = (char) (c[i] - 32);
			}
		}
		String string2 = new String(c);
		System.out.println("<< Server Side >> "+"\n Received Data is : "+string2.trim());
		bufferedReader.close();
		serverSocket.close();
		socket.close();
	}
}
