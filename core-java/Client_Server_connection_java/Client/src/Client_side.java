import java.net.*;
import java.io.*;
import java.util.*;
public class Client_side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		try {
			Socket s = new Socket("localhost",5555);
			DataOutputStream data = new DataOutputStream(s.getOutputStream());
			System.out.println("enter massage to the server: ");
			String str = sn.next();
			data.writeUTF(str);
			data.flush();
			sn.close();
			s.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}
