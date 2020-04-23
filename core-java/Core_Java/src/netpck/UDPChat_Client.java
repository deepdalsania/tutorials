package netpck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPChat_Client {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte rb[] = new byte[1024];
		byte sb[] = new byte[1024];
		while (true) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("[CLIENT] Enter your message : ");
			String s = br.readLine();
			sb = s.getBytes();
			DatagramPacket sp = new DatagramPacket(sb, sb.length, ip, 1203);
			ds.send(sp);

			DatagramPacket rp = new DatagramPacket(rb, rb.length);
			ds.receive(rp);
			String rs = new String(rp.getData());
			rs = rs.trim();
			System.out.println("[CLIENT] Received message is : " + rs);
			if (s.equalsIgnoreCase("bye")) {
				break;
			}
		}
		ds.close();
	}

}
