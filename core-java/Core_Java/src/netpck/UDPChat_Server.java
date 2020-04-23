package netpck;

import java.io.BufferedReader;
// import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPChat_Server {

	public static void main(String[] args) throws Exception {

		DatagramSocket ds = new DatagramSocket(1203);
		byte rb[] = new byte[1024];
		byte sb[] = new byte[1024];
		while (true) {

			DatagramPacket rp = new DatagramPacket(rb, rb.length);
			ds.receive(rp);
			String rs = new String(rp.getData());
			rs = rs.trim();
			System.out.println("[SERVER] Received message is : " + rs);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("[SERVER] Enter your message : ");
			String s = br.readLine();
			sb = s.getBytes();
			InetAddress ip = rp.getAddress();
			int port = rp.getPort();
			DatagramPacket sp = new DatagramPacket(sb, sb.length, ip, port);
			ds.send(sp);
			if (rs.equalsIgnoreCase("bye")) {
				break;
			}
		}
		ds.close();
	}

}
