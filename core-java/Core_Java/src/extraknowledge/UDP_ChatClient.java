package extraknowledge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_ChatClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getLocalHost();
		DatagramSocket ds = new DatagramSocket();
		System.out.println("<< You Can Start Your Chat Now >>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  s = br.readLine();
		
		
			
			if (s != null) {
			byte[] b=s.getBytes(); 
			DatagramPacket dp = new DatagramPacket(b,b.length,ip,901);
			ds.send(dp);
			s=null;
			ds.close();
			}else{
				DatagramSocket ds1 = new DatagramSocket(901);
				byte[] b1 = new byte[5];
					DatagramPacket dp1 = new DatagramPacket(b1 , b1.length);
					ds1.receive(dp1);
					String s1 = new String(b1);
					System.out.println("Received At Client Side "+s1);
					ds1.close();
				
			}
			/*ds.receive(sp);
			System.out.println("Client Send :");
			ss=br.readLine();
			b2=ss.getBytes();
			
	
		}
		System.out.println("Clien send");
		String s = br.readLine();
		byte[] b = s.getBytes();
		
		DatagramPacket dp = new DatagramPacket(b,b.length,ip,1200);
		String ss="";
		DatagramPacket sp;
	
		byte[] b2=new byte[10];*/
		
		
	}	
}	


