package gtu;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Winter16Q3_bOR_Server {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(1301);
		byte[] msg = new byte[1024];
		DatagramPacket dp = new DatagramPacket(msg, msg.length);
		ds.receive(dp);
		String s = new String(dp.getData(), 0, dp.getLength());
		StringBuilder builder = new StringBuilder(s);
		System.out.println("<< Server side >>" + "\n Received Message is : " + builder.reverse());
		ds.close();
	}
}
