package gtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Summer17Q2_b_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9928);
		Socket socket = serverSocket.accept();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String s1 = bufferedReader.readLine();
		String rev = "";
		int l = s1.length();
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println(s1 + " is a Palindrome");
		} else {
			System.out.println(s1 + " is not a Palindrome");
		}
		serverSocket.close();
	}
}
