package gtu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Winter16Q3_bOR_Client {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<< Client to Server >>"+"\n Enter your string : ");
		String s = br.readLine();
		InetAddress ip = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(s.getBytes() , s.length() , ip , 1301 );
		ds.send(dp);
		System.out.println("Packet Send Succesfully...");
		ds.close();
	}
}
