package netpck;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_ChatClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost",1406);
		DataInputStream di = new DataInputStream(s.getInputStream());
		DataOutputStream ds = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sin = "" , sout = "" ;
		System.out.println("<< Client side >>");
		while (!sin.equalsIgnoreCase("bye") && !sin.equalsIgnoreCase("jsk")) {
			
			System.out.println("Enter Message : ");
			sout = br.readLine();
			ds.writeUTF(sout);
			ds.flush();
			sin = di.readUTF();
			System.out.println("[CLIENT] Received Message is : "+sin);
			
		}
		ds.close();
		di.close();
		s.close();
		
	}

}
