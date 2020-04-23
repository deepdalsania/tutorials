package extraknowledge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP_ChatServer {

	/**
	 * @param args
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(901);
		byte[] b = new byte[5];
	//	DatagramPacket sp;
		DatagramPacket dp = new DatagramPacket(b,b.length);
		ds.receive(dp);
		String r=new String(b);
		System.out.println("Received At Server Side "+r);
		ds.close();
		String s1 = null ; 
		
		if (s1 == null) {
			InetAddress ip = InetAddress.getLocalHost();
		
			DatagramSocket ds1 = new DatagramSocket(901);
			System.out.println("Enter Message Server : ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			s1  = br.readLine();
			b=s1.getBytes();
			DatagramPacket dp1 = new DatagramPacket(b,b.length,ip,901);
			ds1.send(dp1);
			ds1.close();
		}
		
		
		/*while (!s.equals("bye")) {
			System.out.println("Server Send : ");
			String d=br.readLine();
			b=d.getBytes();
			sp=new DatagramPacket(b,b.length,ip,1200);
		}*/
		
		
	}

}
