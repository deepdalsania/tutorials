package netpck;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Server {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(1301);
		byte[] msg = new byte[1024];
		DatagramPacket dp = new DatagramPacket(msg, msg.length);
		ds.receive(dp);
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println("<< Server side >>" + "\n Received Message is : " + s.trim());
		ds.close();
	}

}
