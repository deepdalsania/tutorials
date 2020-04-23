package netpck;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_ChatServer {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1406);
		Socket s = ss.accept();
		DataInputStream di = new DataInputStream(s.getInputStream());
		DataOutputStream ds = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sin = "" , sout = "" ;
		
		while (!sin.equalsIgnoreCase("bye") && !sin.equalsIgnoreCase("jsk")) {
			
			sin = di.readUTF();
			System.out.println("[SERVER] Received Message is : "+sin);
			System.out.println("Enter Message : ");
			sout = br.readLine();
			ds.writeUTF(sout);
			ds.flush();
		}
		di.close();
		ds.close();
		s.close();
		ss.close();
	
	}

}
