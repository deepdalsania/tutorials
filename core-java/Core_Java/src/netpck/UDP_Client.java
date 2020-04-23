package netpck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDP_Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*System.out.println("Enter size of an ARRAY : ");
		int n = Integer.parseInt(br.readLine());
		byte[] b = new byte[n];*/
		System.out.println("<< Client to Server >>"+"\n Enter your name : ");
		String s = br.readLine();
		InetAddress ip = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(s.getBytes() , s.length() , ip , 1301 );
		ds.send(dp);
		System.out.println("Packet Send Succesfully...");
		ds.close();
	}

}
