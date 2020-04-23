package gtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Summer16Q_2b_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("127.0.0.1",9923);
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<< Client to Server >>"+"\n Enter your String : ");
		printStream.println(bufferedReader.readLine());
		printStream.flush();
		printStream.close();
		bufferedReader.close();
		socket.close();
	}
}
