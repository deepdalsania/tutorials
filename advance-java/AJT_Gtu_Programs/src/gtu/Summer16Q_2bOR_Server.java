package gtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Summer16Q_2bOR_Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(9925);
		Socket socket = serverSocket.accept();
		System.out.println("Connection Established...");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		int[] a = new int[10];
		int i, j, temp;
		for (i = 0; i <= 9; i++) {
			a[i] = bufferedReader.read();
		}
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 10 - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted List is");
		for (i = 0; i <= 9; i++) {
			System.out.println(a[i]);
		}
		bufferedReader.close();
		serverSocket.close();
		socket.close();
	}
}
